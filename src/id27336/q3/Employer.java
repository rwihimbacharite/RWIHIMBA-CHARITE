package id27336.q3;

import java.util.Date;

public class Employer extends Taxpayer {
    private String employerName, employerTIN, contact;
    
    public Employer(int id, Date createdDate, Date updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address);
        if (employerName == null || !employerName.matches(".*\\d.*")) {
            this.employerName = employerName;
        } else {
            System.out.println("ERROR: Employer name cannot contain numbers");
        }
        if (employerTIN == null || employerTIN.matches("\\d{9}")) {
            this.employerTIN = employerTIN;
        } else {
            System.out.println("ERROR: Employer TIN must be 9 digits");
        }
        if (contact == null || contact.matches("\\d{10}")) {
            this.contact = contact;
        } else {
            System.out.println("ERROR: Phone must be 10 digits");
        }
    }
    
    public String getEmployerName() { return employerName; }
}