package id27336.q6;

import java.util.Date;

public class Employee extends Department {
    private int employeeID;
    private String fullName, position;
    private double baseSalary;
    private boolean rssbRegistered;
    
    public Employee(int id, Date createdDate, Date updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        if (employeeID < 1000) throw new IllegalArgumentException("Employee ID must be >= 1000");
        if (baseSalary <= 0) throw new IllegalArgumentException("Base salary must be > 0");
        this.employeeID = employeeID; this.fullName = fullName; this.position = position; this.baseSalary = baseSalary; this.rssbRegistered = rssbRegistered;
    }
    
    public String getFullName() { return fullName; }
    public double getBaseSalary() { return baseSalary; }
    public int getEmployeeID() { return employeeID; }
}