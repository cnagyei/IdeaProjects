package com.oath.africa.business;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Service for interacting with Odoo via XML-RPC API
 */
@Service
public class OdooClientService {
    
    @Value("${odoo.url:http://localhost:8069}")
    private String odooUrl;
    
    @Value("${odoo.database:odoo}")
    private String database;
    
    @Value("${odoo.username:admin}")
    private String username;
    
    @Value("${odoo.password:admin}")
    private String password;
    
    private Integer uid;
    
    /**
     * Authenticate with Odoo and get user ID
     */
    public Integer authenticate() throws MalformedURLException, XmlRpcException {
        if (uid != null) {
            return uid;
        }
        
        XmlRpcClient client = createClient("common");
        Object[] params = new Object[]{database, username, password, new HashMap<>()};
        uid = (Integer) client.execute("authenticate", params);
        return uid;
    }
    
    /**
     * Execute a search_read operation on Odoo
     * @param model The Odoo model name (e.g., "account.move")
     * @param domain Search domain (e.g., [["state", "=", "posted"]])
     * @param fields Fields to retrieve
     * @param limit Maximum number of records
     * @param order Sort order (e.g., "id desc")
     * @return List of records
     */
    public List<Map<String, Object>> searchRead(String model, List<Object> domain, 
                                                 List<String> fields, int limit, String order) 
            throws MalformedURLException, XmlRpcException {
        authenticate();
        
        XmlRpcClient client = createClient("object");
        
        // Build search_read parameters
        Map<String, Object> searchReadParams = new HashMap<>();
        searchReadParams.put("fields", fields);
        searchReadParams.put("limit", limit);
        if (order != null && !order.isEmpty()) {
            searchReadParams.put("order", order);
        }
        
        // Execute search_read
        Object[] params = new Object[]{
            database, uid, password, model, "search_read", 
            domain, searchReadParams
        };
        
        Object[] results = (Object[]) client.execute("execute_kw", params);
        List<Map<String, Object>> records = new ArrayList<>();
        for (Object result : results) {
            records.add((Map<String, Object>) result);
        }
        
        return records;
    }
    
    /**
     * Create XML-RPC client
     */
    private XmlRpcClient createClient(String endpoint) throws MalformedURLException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL(odooUrl + "/xmlrpc/2/" + endpoint));
        config.setConnectionTimeout(5000);
        config.setReplyTimeout(10000);
        
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        return client;
    }
}
