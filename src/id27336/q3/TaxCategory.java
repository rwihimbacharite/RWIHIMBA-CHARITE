package id27336.q3;

import java.util.Date;

public class TaxCategory extends TaxAuthority {
    private String categoryName, code;
    private double rate;
    
    public TaxCategory(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if (rate > 0) {
            this.rate = rate;
        } else {
            System.out.println("ERROR: Rate must be > 0");
        }
        if (code == null || (code.length() >= 3 && code.matches("[a-zA-Z0-9]+"))) {
            this.code = code;
        } else {
            System.out.println("ERROR: Code must be alphanumeric and >= 3 chars");
        }
        this.categoryName = categoryName;
    }
    
    public double getRate() { return rate; }
    public String getCategoryName() { return categoryName; }
}