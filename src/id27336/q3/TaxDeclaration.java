package id27336.q3;

import java.util.Date;

public class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome;
    
    public TaxDeclaration(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact, String employeeName, double salary, String employeeTIN, String declarationMonth, double totalIncome) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        if (totalIncome < 0) throw new TaxDataException("Income must be >= 0");
        this.declarationMonth = declarationMonth; this.totalIncome = totalIncome;
    }
    
    public double getTotalIncome() { return totalIncome; }
}