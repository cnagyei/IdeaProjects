package com.oath.africa.business;

import dev.langchain4j.agent.tool.Tool;
import org.apache.xmlrpc.XmlRpcException;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * LangChain4j tools for interacting with Odoo
 */
@Component
public class OdooTools {
    
    private final OdooClientService odooClientService;
    
    public OdooTools(OdooClientService odooClientService) {
        this.odooClientService = odooClientService;
    }
    
    @Tool("Lists the last 5 invoices from Odoo. Returns invoice information including ID, name, partner, amount, state, and date.")
    public String listLast5Invoices() {
        try {
            // Search for invoices (account.move model in Odoo)
            // Domain: get invoices (move_type = 'out_invoice' for customer invoices)
            List<Object> domain = new ArrayList<>();
            domain.add(List.of("move_type", "in", List.of("out_invoice", "in_invoice")));
            
            // Fields to retrieve
            List<String> fields = List.of(
                "id", "name", "partner_id", "amount_total", 
                "state", "invoice_date", "invoice_date_due", "currency_id"
            );
            
            // Get last 5 invoices ordered by ID descending
            List<Map<String, Object>> invoices = odooClientService.searchRead(
                "account.move", 
                domain, 
                fields, 
                5, 
                "id desc"
            );
            
            if (invoices.isEmpty()) {
                return "No invoices found in Odoo.";
            }
            
            // Convert to Invoice objects and format response
            List<Invoice> invoiceList = invoices.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());
            
            StringBuilder response = new StringBuilder();
            response.append("Last 5 invoices from Odoo:\n\n");
            
            for (int i = 0; i < invoiceList.size(); i++) {
                Invoice invoice = invoiceList.get(i);
                response.append(String.format("%d. Invoice #%s\n", i + 1, invoice.getName()));
                response.append(String.format("   ID: %d\n", invoice.getId()));
                response.append(String.format("   Partner: %s\n", 
                    invoice.getPartnerName() != null ? invoice.getPartnerName() : "N/A"));
                response.append(String.format("   Amount: %s %s\n", 
                    invoice.getAmountTotal() != null ? invoice.getAmountTotal() : "0.00",
                    invoice.getCurrency() != null ? invoice.getCurrency() : ""));
                response.append(String.format("   State: %s\n", 
                    invoice.getState() != null ? invoice.getState() : "N/A"));
                response.append(String.format("   Date: %s\n", 
                    invoice.getInvoiceDate() != null ? invoice.getInvoiceDate() : "N/A"));
                if (invoice.getDateDue() != null) {
                    response.append(String.format("   Due Date: %s\n", invoice.getDateDue()));
                }
                response.append("\n");
            }
            
            return response.toString();
            
        } catch (MalformedURLException | XmlRpcException e) {
            return "Error retrieving invoices from Odoo: " + e.getMessage();
        } catch (Exception e) {
            return "Unexpected error: " + e.getMessage();
        }
    }
}
