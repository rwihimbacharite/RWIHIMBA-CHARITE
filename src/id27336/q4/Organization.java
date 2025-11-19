package id27336.q4;

import java.util.Date;

public class Organization extends Entity {
    private String orgName, address, contactEmail;
    
    public Organization(int id, Date createdDate, Date updatedDate, String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (contactEmail != null && !contactEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
        this.orgName = orgName; this.address = address; this.contactEmail = contactEmail;
    }
    
    public String getOrgName() { return orgName; }
}