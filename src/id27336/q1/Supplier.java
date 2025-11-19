package id27336.q1;

import java.util.Date;

public class Supplier extends Category {
    private String supplierName, supplierEmail, supplierPhone;
    
    public Supplier(int id, Date createdDate, Date updatedDate, String warehouseName, String location, String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode);
        if (supplierName != null && supplierName.matches(".*\\d.*")) throw new IllegalArgumentException("Supplier name cannot contain numbers");
        if (supplierEmail != null && !supplierEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (supplierPhone != null && !supplierPhone.matches("\\d{10}")) throw new IllegalArgumentException("Phone must be 10 digits");
        this.supplierName = supplierName; this.supplierEmail = supplierEmail; this.supplierPhone = supplierPhone;
    }
    
    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getSupplierPhone() { return supplierPhone; }
}