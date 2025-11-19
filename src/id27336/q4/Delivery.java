package id27336.q4;

import java.util.Date;

public class Delivery extends PurchaseOrder {
    private Date deliveryDate;
    private String deliveredBy;
    
    public Delivery(int id, Date createdDate, Date updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, Date orderDate, double totalAmount, Date deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        if (deliveryDate == null || deliveredBy == null) throw new IllegalArgumentException("Delivery date and delivered by cannot be null");
        this.deliveryDate = deliveryDate; this.deliveredBy = deliveredBy;
    }
    
    public String getDeliveredBy() { return deliveredBy; }
}