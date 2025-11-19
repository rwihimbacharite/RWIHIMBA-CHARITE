package id27336.q6;

import java.util.Date;

public class Payroll extends Allowance {
    private double grossSalary, totalDeductions, netSalary;
    
    public Payroll(int id, Date createdDate, Date updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction, double overtimeHours, double overtimeRate, double bonus, double grossSalary, double totalDeductions, double netSalary) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        double expectedGross = basicPay + transportAllowance + housingAllowance + (overtimeHours * overtimeRate) + bonus;
        double expectedDeductions = rssbContribution + payeTax + loanDeduction;
        if (Math.abs(grossSalary - expectedGross) > 0.01) throw new IllegalArgumentException("Gross salary calculation error");
        if (Math.abs(netSalary - (grossSalary - totalDeductions)) > 0.01) throw new IllegalArgumentException("Net salary calculation error");
        this.grossSalary = grossSalary; this.totalDeductions = totalDeductions; this.netSalary = netSalary;
    }
    
    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }
}