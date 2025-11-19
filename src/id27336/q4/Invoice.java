package id27336.q4;

import java.util.Date;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount;
    
    public Invoice(int id, Date createdDate, Date updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, Date orderDate, double totalAmount, Date deliveryDate, String deliveredBy, String inspectorName, String status, String remarks, String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks);
        if (invoiceAmount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        this.invoiceNo = invoiceNo; this.invoiceAmount = invoiceAmount;
    }
    
    public double getInvoiceAmount() { return invoiceAmount; }
}