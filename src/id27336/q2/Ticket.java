package id27336.q2;

import java.util.Date;

public final class Ticket extends Payment {
    private String ticketNumber;
    private Date issueDate;
    
    public Ticket(int id, Date createdDate, Date updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, Date bookingDate, String seatNumber, String travelClass, Date paymentDate, String paymentMethod, double amountPaid, String ticketNumber, Date issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber; this.issueDate = issueDate;
    }
    
    public double calculateFare() {
        double taxes = getBaseFare() * 0.15;
        double discount = getTravelClass().equals("Economy") ? 0 : getBaseFare() * 0.1;
        return getBaseFare() + taxes - discount;
    }
    
    public String getTicketNumber() { return ticketNumber; }
}