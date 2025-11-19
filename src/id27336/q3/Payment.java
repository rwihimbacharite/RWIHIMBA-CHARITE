package id27336.q3;

import java.util.Date;

public class Payment extends TaxAssessment {
    private Date paymentDate;
    private double paymentAmount;
    
    public Payment(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome, Date assessmentDate, double assessedTax, Date paymentDate, double paymentAmount) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax);
        if (paymentAmount <= 0) throw new TaxDataException("Payment amount must be > 0");
        this.paymentDate = paymentDate; this.paymentAmount = paymentAmount;
    }
    
    public double getPaymentAmount() { return paymentAmount; }
}