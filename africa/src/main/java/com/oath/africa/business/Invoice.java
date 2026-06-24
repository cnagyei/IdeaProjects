package com.oath.africa.business;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

/**
 * DTO representing an Odoo invoice
 */
public class Invoice {
    private Integer id;
    private String name;
    private String partnerName;
    private BigDecimal amountTotal;
    private String state;
    private LocalDate invoiceDate;
    private LocalDate dateDue;
    private String currency;
    
    public Invoice() {}
    
    public Invoice(Map<String, Object> odooData) {
        this.id = (Integer) odooData.get("id");
        this.name = (String) odooData.get("name");
        
        // Handle partner_id which is typically [id, name] array in Odoo
        Object partnerId = odooData.get("partner_id");
        if (partnerId instanceof Object[]) {
            Object[] partnerArray = (Object[]) partnerId;
            if (partnerArray.length > 1) {
                this.partnerName = (String) partnerArray[1];
            }
        }
        
        // Handle amount_total
        Object amountTotalObj = odooData.get("amount_total");
        if (amountTotalObj instanceof Number) {
            this.amountTotal = BigDecimal.valueOf(((Number) amountTotalObj).doubleValue());
        }
        
        this.state = (String) odooData.get("state");
        
        // Handle dates
        Object invoiceDateObj = odooData.get("invoice_date");
        if (invoiceDateObj instanceof String) {
            this.invoiceDate = LocalDate.parse((String) invoiceDateObj);
        }
        
        Object dateDueObj = odooData.get("invoice_date_due");
        if (dateDueObj instanceof String) {
            this.dateDue = LocalDate.parse((String) dateDueObj);
        }
        
        // Handle currency_id which is typically [id, name] array in Odoo
        Object currencyId = odooData.get("currency_id");
        if (currencyId instanceof Object[]) {
            Object[] currencyArray = (Object[]) currencyId;
            if (currencyArray.length > 1) {
                this.currency = (String) currencyArray[1];
            }
        }
    }
    
    // Getters and setters
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPartnerName() {
        return partnerName;
    }
    
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
    
    public BigDecimal getAmountTotal() {
        return amountTotal;
    }
    
    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }
    
    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
    public LocalDate getDateDue() {
        return dateDue;
    }
    
    public void setDateDue(LocalDate dateDue) {
        this.dateDue = dateDue;
    }
    
    public String getCurrency() {
        return currency;
    }
    
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    @Override
    public String toString() {
        return String.format("Invoice{id=%d, name='%s', partner='%s', amount=%s %s, state='%s', date=%s}",
                id, name, partnerName, amountTotal, currency, state, invoiceDate);
    }
}
