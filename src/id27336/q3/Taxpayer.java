package id27336.q3;

import java.util.Date;

public class Taxpayer extends TaxCategory {
    private String tin, taxpayerName, address;
    
    public Taxpayer(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);
        if (tin == null || (tin.length() == 9 && tin.matches("\\d{9}"))) {
            this.tin = tin;
        } else {
            System.out.println("ERROR: TIN must be exactly 9 digits");
        }
        if (taxpayerName != null && !taxpayerName.trim().isEmpty() && !taxpayerName.matches(".*\\d.*")) {
            this.taxpayerName = taxpayerName;
        } else {
            System.out.println("ERROR: Taxpayer name cannot be empty or contain numbers");
        }
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            System.out.println("ERROR: Address cannot be empty");
        }
    }
    
    public String getTin() { return tin; }
    public String getTaxpayerName() { return taxpayerName; }
}