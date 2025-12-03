package id27336.q3;

import java.util.Date;

public class Employee extends Employer {
    private String employeeName, employeeTIN;
    private double salary;
    
    public Employee(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact);
        if (employeeName == null || !employeeName.matches(".*\\d.*")) {
            this.employeeName = employeeName;
        } else {
            System.out.println("ERROR: Employee name cannot contain numbers");
        }
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("ERROR: Salary must be > 0");
        }
        if (employeeTIN == null || employeeTIN.matches("\\d{9}")) {
            this.employeeTIN = employeeTIN;
        } else {
            System.out.println("ERROR: Employee TIN must be 9 digits");
        }
    }
    
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
}