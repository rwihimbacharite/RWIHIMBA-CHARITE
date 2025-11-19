package id27336.q3;

import java.util.Date;

public class TaxAuthority extends Entity {
    private String authorityName, region, email;
    
    public TaxAuthority(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email) throws TaxDataException {
        super(id, createdDate, updatedDate);
        if (email != null && !email.contains("@")) throw new TaxDataException("Invalid email");
        this.authorityName = authorityName; this.region = region; this.email = email;
    }
    
    public String getAuthorityName() { return authorityName; }
}