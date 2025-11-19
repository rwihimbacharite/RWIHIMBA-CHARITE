package id27336.q4;

import java.util.Date;

public final class ProcurementReport extends Invoice {
    private Date reportDate;
    private String summary;
    
    public ProcurementReport(int id, Date createdDate, Date updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, Date orderDate, double totalAmount, Date deliveryDate, String deliveredBy, String inspectorName, String status, String remarks, String invoiceNo, double invoiceAmount, Date reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks, invoiceNo, invoiceAmount);
        this.reportDate = reportDate; this.summary = summary;
    }
    
    public double calculateTotal() {
        return getInvoiceAmount();
    }
}