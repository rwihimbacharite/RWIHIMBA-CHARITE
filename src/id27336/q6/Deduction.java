package id27336.q6;

import java.util.Date;

public class Deduction extends SalaryStructure {
    private double rssbContribution, payeTax, loanDeduction;
    
    public Deduction(int id, Date createdDate, Date updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail, String deptName, String deptCode, String managerName, int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered, int month, int year, Date startDate, Date endDate, double basicPay, double transportAllowance, double housingAllowance, double rssbContribution, double payeTax, double loanDeduction) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        if (rssbContribution < 0 || payeTax < 0 || loanDeduction < 0) throw new IllegalArgumentException("Deductions must be >= 0");
        if (Math.abs(rssbContribution - (basicPay * 0.05)) > 0.01) throw new IllegalArgumentException("RSSB contribution must be 5% of basic pay");
        this.rssbContribution = rssbContribution; this.payeTax = payeTax; this.loanDeduction = loanDeduction;
    }
    
    public double getRssbContribution() { return rssbContribution; }
    public double getPayeTax() { return payeTax; }
    public double getLoanDeduction() { return loanDeduction; }
}