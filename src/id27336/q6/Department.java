package id27336.q6;

import java.util.Date;

public class Department extends Organization {
    private String deptName, deptCode, managerName;
    
    public Department(int id, Date createdDate, Date updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptCode != null && (deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+"))) throw new IllegalArgumentException("Dept code must be alphanumeric and >= 3 chars");
        if (deptName == null || deptName.trim().isEmpty()) throw new IllegalArgumentException("Department name cannot be empty");
        if (managerName == null || managerName.trim().isEmpty()) throw new IllegalArgumentException("Manager name cannot be empty");
        this.deptName = deptName; this.deptCode = deptCode; this.managerName = managerName;
    }
    
    public String getDeptName() { return deptName; }
}