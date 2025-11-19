package id27336.q5;

import java.util.Date;

public class Instructor extends Course {
    private String instructorName, email, phone;
    
    public Instructor(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        if (email != null && (!email.contains("@") || !email.contains("."))) throw new IllegalArgumentException("Invalid email format");
        if (phone != null && (phone.length() != 10 || !phone.matches("\\d{10}"))) throw new IllegalArgumentException("Phone must be exactly 10 digits");
        this.instructorName = instructorName; this.email = email; this.phone = phone;
    }
    
    public String getInstructorName() { return instructorName; }
}