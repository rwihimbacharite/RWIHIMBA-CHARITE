package id27336.q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        
        System.out.print("Enter passenger name: ");
        String passengerName = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter travel class (Economy/Business/First): ");
        String travelClass = sc.nextLine();
        System.out.print("Enter seat number: ");
        String seatNumber = sc.nextLine();
        
        Ticket ticket = new Ticket(1, now, now, "Kigali Airport", "KGL", "Kigali", "RwandAir", "WB", "info@rwandair.com", "WB101", "Kigali", "Dubai", 500.0, "John Pilot", "PIL123", 5, "Jane Crew", "Flight Attendant", "Day", passengerName, age, "M", "0781234567", now, seatNumber, travelClass, now, "Credit Card", 575.0, "TKT001", now);
        
        System.out.println("\n27336 Flight Booking Confirmed!");
        System.out.println("27336 Passenger: " + ticket.getPassengerName() + ", Seat: " + ticket.getSeatNumber());
        System.out.println("27336 Total Fare: $" + ticket.calculateFare());
        sc.close();
    }
}