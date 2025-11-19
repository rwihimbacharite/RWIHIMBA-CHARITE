package id27336.q2;

import java.util.Date;

public class Passenger extends CabinCrew {
    private String passengerName, gender, contact;
    private int age;
    
    public Passenger(int id, Date createdDate, Date updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift);
        if (passengerName != null && passengerName.matches(".*\\d.*")) throw new IllegalArgumentException("Passenger name cannot contain numbers");
        if (age <= 0) throw new IllegalArgumentException("Age must be > 0");
        if (gender != null && !gender.equals("M") && !gender.equals("F")) throw new IllegalArgumentException("Gender must be M or F");
        this.passengerName = passengerName; this.age = age; this.gender = gender; this.contact = contact;
    }
    
    public String getPassengerName() { return passengerName; }
    public int getAge() { return age; }
}