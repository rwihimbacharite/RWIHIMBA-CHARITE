package id27336.q6;

import java.util.Date;

public class Organization extends Entity {
    private String orgName, orgCode, rssbNumber, contactEmail;
    
    public Organization(int id, Date createdDate, Date updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (orgName != null && orgName.matches(".*\\d.*")) throw new IllegalArgumentException("Organization name cannot contain numbers");
        if (rssbNumber != null && (rssbNumber.length() != 8 || !rssbNumber.matches("\\d{8}"))) throw new IllegalArgumentException("RSSB number must be exactly 8 digits");
        if (contactEmail != null && (!contactEmail.contains("@") || !contactEmail.contains("."))) throw new IllegalArgumentException("Invalid email format");
        if (orgCode != null && (orgCode.length() < 3 || !orgCode.matches("[a-zA-Z0-9]+"))) throw new IllegalArgumentException("Org code must be alphanumeric and >= 3 chars");
        if (orgName == null || orgName.trim().isEmpty()) throw new IllegalArgumentException("Organization name cannot be empty");
        this.orgName = orgName; this.orgCode = orgCode; this.rssbNumber = rssbNumber; this.contactEmail = contactEmail;
    }
    
    public String getOrgName() { return orgName; }
}