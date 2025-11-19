package id27336.q1;

import java.util.Date;

public class Warehouse extends Entity {
    private String warehouseName, location, contactNumber;
    
    public Warehouse(int id, Date createdDate, Date updatedDate, String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        if (contactNumber != null && !contactNumber.matches("\\d{10}")) throw new IllegalArgumentException("Phone must be 10 digits");
        this.warehouseName = warehouseName; this.location = location; this.contactNumber = contactNumber;
    }
    
    public String getWarehouseName() { return warehouseName; }
    public String getLocation() { return location; }
    public String getContactNumber() { return contactNumber; }
}