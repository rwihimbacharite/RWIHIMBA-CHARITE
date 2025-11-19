package id27336.q5;

import java.util.Date;

public class Institution extends Entity {
    private String institutionName, code, address;
    
    public Institution(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (code != null && code.length() < 3) throw new IllegalArgumentException("Code must be >= 3 chars");
        this.institutionName = institutionName; this.code = code; this.address = address;
    }
    
    public String getInstitutionName() { return institutionName; }
}