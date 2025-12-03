package id27336.q3;

import java.util.Date;

public class TaxAuthority extends Entity {
    private String authorityName, region, email;
    
    public TaxAuthority(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        if (authorityName == null || !authorityName.matches(".*\\d.*")) {
            this.authorityName = authorityName;
        } else {
            System.out.println("ERROR: Authority name cannot contain numbers");
        }
        if (email == null || email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("ERROR: Invalid email");
        }
        this.region = region;
    }
    
    public String getAuthorityName() { return authorityName; }
}