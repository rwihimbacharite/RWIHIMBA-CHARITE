package id27336.q2;

import java.util.Date;

public class Pilot extends Flight {
    private String pilotName, licenseNumber;
    private int experienceYears;
    
    public Pilot(int id, Date createdDate, Date updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare);
        if (pilotName != null && pilotName.matches(".*\\d.*")) throw new IllegalArgumentException("Pilot name cannot contain numbers");
        if (licenseNumber == null || licenseNumber.isEmpty()) throw new IllegalArgumentException("License cannot be empty");
        if (experienceYears < 2) throw new IllegalArgumentException("Experience must be >= 2 years");
        this.pilotName = pilotName; this.licenseNumber = licenseNumber; this.experienceYears = experienceYears;
    }
    
    public String getPilotName() { return pilotName; }
    public int getExperienceYears() { return experienceYears; }
}