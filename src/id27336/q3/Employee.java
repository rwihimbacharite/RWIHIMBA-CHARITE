package id27336.q3;

import java.util.Date;

public class Employee extends Employer {
    private String employeeName, employeeTIN;
    private double salary;
    
    public Employee(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact);
        if (salary <= 0) throw new TaxDataException("Salary must be > 0");
        if (employeeTIN != null && employeeTIN.length() != 9) throw new TaxDataException("Employee TIN must be 9 digits");
        this.employeeName = employeeName; this.salary = salary; this.employeeTIN = employeeTIN;
    }
    
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
}