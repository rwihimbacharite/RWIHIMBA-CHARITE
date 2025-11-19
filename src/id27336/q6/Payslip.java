package id27336.q6;

import java.util.Date;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private Date issueDate;
    
    public Payslip(int id, Date createdDate, Date updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction, double overtimeHours, double overtimeRate, double bonus, double grossSalary, double totalDeductions, double netSalary, String payslipNumber, Date issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus, grossSalary, totalDeductions, netSalary);
        this.payslipNumber = payslipNumber; this.issueDate = issueDate;
    }
    
    public String generatePayslip() {
        return "27336 - PAYSLIP\nEmployee: " + getFullName() + " (ID: " + getEmployeeID() + ")\nGross Salary: $" + getGrossSalary() + "\nRSSB: $" + getRssbContribution() + "\nPAYE: $" + getPayeTax() + "\nNet Salary: $" + getNetSalary();
    }
    
    public String getPayslipNumber() { return payslipNumber; }
}