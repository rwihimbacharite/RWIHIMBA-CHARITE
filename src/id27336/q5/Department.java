package id27336.q5;

import java.util.Date;

public class Department extends Institution {
    private String departmentName, departmentHead;
    
    public Department(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);
        if (departmentName == null || departmentName.isEmpty()) throw new IllegalArgumentException("Department name cannot be empty");
        this.departmentName = departmentName; this.departmentHead = departmentHead;
    }
    
    public String getDepartmentName() { return departmentName; }
}