package id27336.q3;

import java.util.Date;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;
    
    public TaxRecord(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, Date assessmentDate, double assessedTax, Date paymentDate, double paymentAmount, String receiptNo, double totalTax) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = receiptNo; this.totalTax = totalTax;
    }
    
    public double computeTax() {
        double credits = 50000;
        return (getSalary() * getRate()) - credits;
    }
    
    public String getReceiptNo() { return receiptNo; }
}