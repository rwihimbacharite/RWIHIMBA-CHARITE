package id27336.q5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        
        try {
            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();
            System.out.print("Enter student ID: ");
            String studentID = sc.nextLine();
            System.out.print("Enter total present days: ");
            int totalPresent = sc.nextInt();
            System.out.print("Enter total absent days: ");
            int totalAbsent = sc.nextInt();
            
            AttendanceSummary summary = new AttendanceSummary(1, now, now, "University of Rwanda", "UR001", "Kigali Campus", "Computer Science Department", "Dr. Smith", "Java Programming Course", "CS101", 3, "Prof. Johnson", "prof@ur.ac.rw", "0781234567", studentName, studentID, 20, now, "Object-Oriented Programming", studentID, "SES001", "Present", now, "Medical appointment", true, now, totalPresent, totalAbsent);
            
            System.out.println("\n27336 Attendance Summary Generated!");
            System.out.println("27336 Student: " + summary.getStudentName() + " (" + summary.getStudentID() + ")");
            System.out.println("27336 Attendance Rate: " + summary.generateSummary() + "%");
            
        } catch (IllegalArgumentException e) {
            System.out.println("VALIDATION ERROR: " + e.getMessage());
            System.out.println("Attendance processing terminated due to validation failure.");
            return;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return;
        } finally {
            sc.close();
        }
    }
}