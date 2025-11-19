package id27336.q4;

import java.util.Date;

public class Department extends Organization {
    private String deptName, deptCode;
    
    public Department(int id, Date createdDate, Date updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        if (deptName != null && deptName.matches(".*\\d.*")) throw new IllegalArgumentException("Department name cannot contain numbers");
        if (deptCode != null && (deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+"))) throw new IllegalArgumentException("Code must be alphanumeric and >= 3 chars");
        if (deptName == null || deptName.trim().isEmpty()) throw new IllegalArgumentException("Department name cannot be empty");
        this.deptName = deptName; this.deptCode = deptCode;
    }
    
    public String getDeptName() { return deptName; }
}