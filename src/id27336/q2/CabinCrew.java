package id27336.q2;

import java.util.Date;

public class CabinCrew extends Pilot {
    private String crewName, role, shift;
    
    public CabinCrew(int id, Date createdDate, Date updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        if (crewName != null && crewName.matches(".*\\d.*")) throw new IllegalArgumentException("Crew name cannot contain numbers");
        if (role == null || role.isEmpty()) throw new IllegalArgumentException("Role cannot be empty");
        if (shift != null && !shift.equals("Day") && !shift.equals("Night")) throw new IllegalArgumentException("Shift must be Day/Night");
        this.crewName = crewName; this.role = role; this.shift = shift;
    }
    
    public String getCrewName() { return crewName; }
    public String getRole() { return role; }
}