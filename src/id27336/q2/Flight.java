package id27336.q2;

import java.util.Date;

public class Flight extends Airline {
    private String flightNumber, departure, destination;
    private double baseFare;
    
    public Flight(int id, Date createdDate, Date updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail);
        if (baseFare <= 0) throw new IllegalArgumentException("Fare must be > 0");
        if (flightNumber == null || flightNumber.isEmpty()) throw new IllegalArgumentException("Flight number cannot be empty");
        if (departure == null || departure.isEmpty()) throw new IllegalArgumentException("Departure cannot be empty");
        if (destination == null || destination.isEmpty()) throw new IllegalArgumentException("Destination cannot be empty");
        this.flightNumber = flightNumber; this.departure = departure; this.destination = destination; this.baseFare = baseFare;
    }
    
    public String getFlightNumber() { return flightNumber; }
    public double getBaseFare() { return baseFare; }
}