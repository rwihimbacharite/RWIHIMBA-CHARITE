package id27336.q2;

import java.util.Date;

public class Airline extends Airport {
    private String airlineName, airlineCode, contactEmail;
    
    public Airline(int id, Date createdDate, Date updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        if (airlineName != null && airlineName.matches(".*\\d.*")) throw new IllegalArgumentException("Airline name cannot contain numbers");
        if (airlineCode != null && (airlineCode.length() < 2 || airlineCode.length() > 4 || !airlineCode.matches("[A-Za-z]+"))) throw new IllegalArgumentException("Code must be 2-4 letters");
        if (contactEmail != null && !contactEmail.contains("@")) throw new IllegalArgumentException("Invalid email");
        this.airlineName = airlineName; this.airlineCode = airlineCode; this.contactEmail = contactEmail;
    }
    
    public String getAirlineName() { return airlineName; }
    public String getAirlineCode() { return airlineCode; }
}