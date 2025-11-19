package id27336.q2;

import java.util.Date;

public class Airport extends Entity {
    private String airportName, code, location;
    
    public Airport(int id, Date createdDate, Date updatedDate, String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        if (airportName != null && airportName.matches(".*\\d.*")) throw new IllegalArgumentException("Airport name cannot contain numbers");
        if (code != null && (code.length() != 3 || !code.matches("[A-Z]{3}"))) throw new IllegalArgumentException("Code must be 3 uppercase letters");
        this.airportName = airportName; this.code = code; this.location = location;
    }
    
    public String getAirportName() { return airportName; }
    public String getCode() { return code; }
}