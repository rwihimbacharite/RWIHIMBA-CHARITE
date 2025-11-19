package id27336.q4;

import java.util.Date;

public class Inspection extends Delivery {
    private String inspectorName, status, remarks;
    
    public Inspection(int id, Date createdDate, Date updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact, String productName, double unitPrice, int quantity, String poNumber, Date orderDate, double totalAmount, Date deliveryDate, String deliveredBy, String inspectorName, String status, String remarks) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
        if (status != null && !status.equals("Passed") && !status.equals("Failed")) throw new IllegalArgumentException("Status must be Passed/Failed");
        this.inspectorName = inspectorName; this.status = status; this.remarks = remarks;
    }
    
    public String getStatus() { return status; }
}