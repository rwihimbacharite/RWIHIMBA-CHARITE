package id27336.q3;

import java.util.Date;

public class Taxpayer extends TaxCategory {
    private String tin, taxpayerName, address;
    
    public Taxpayer(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);
        if (tin != null && (tin.length() != 9 || !tin.matches("\\d{9}"))) throw new TaxDataException("TIN must be exactly 9 digits");
        if (taxpayerName == null || taxpayerName.trim().isEmpty()) throw new TaxDataException("Taxpayer name cannot be empty");
        if (address == null || address.trim().isEmpty()) throw new TaxDataException("Address cannot be empty");
        this.tin = tin; this.taxpayerName = taxpayerName; this.address = address;
    }
    
    public String getTin() { return tin; }
    public String getTaxpayerName() { return taxpayerName; }
}