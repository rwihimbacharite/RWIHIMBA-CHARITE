package id27336.q6;

import java.util.Date;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay, transportAllowance, housingAllowance;
    
    public SalaryStructure(int id, Date createdDate, Date updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
        if (basicPay < 0 || transportAllowance < 0 || housingAllowance < 0) throw new IllegalArgumentException("All amounts must be >= 0");
        this.basicPay = basicPay; this.transportAllowance = transportAllowance; this.housingAllowance = housingAllowance;
    }
    
    public double getBasicPay() { return basicPay; }
    public double getTransportAllowance() { return transportAllowance; }
    public double getHousingAllowance() { return housingAllowance; }
}