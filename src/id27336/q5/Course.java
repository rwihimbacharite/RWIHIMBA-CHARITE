package id27336.q5;

import java.util.Date;

public class Course extends Department {
    private String courseName, courseCode;
    private int credits;
    
    public Course(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead);
        if (credits <= 0) throw new IllegalArgumentException("Credits must be > 0");
        this.courseName = courseName; this.courseCode = courseCode; this.credits = credits;
    }
    
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }
}