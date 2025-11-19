package id27336.q4;

import java.util.Date;

public class Supplier extends Department {
    private String supplierName, supplierTIN, contact;
    
    public Supplier(int id, Date createdDate, Date updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode, String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
        if (supplierTIN != null && (supplierTIN.length() != 9 || !supplierTIN.matches("\\d{9}"))) throw new IllegalArgumentException("TIN must be exactly 9 digits");
        if (contact != null && (contact.length() != 10 || !contact.matches("\\d{10}"))) throw new IllegalArgumentException("Phone must be exactly 10 digits");
        this.supplierName = supplierName; this.supplierTIN = supplierTIN; this.contact = contact;
    }
    
    public String getSupplierName() { return supplierName; }
}