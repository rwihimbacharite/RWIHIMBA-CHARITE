package id27336.q5;

import java.util.Date;

public class AttendanceRecord extends ClassSession {
    private String recordStudentID, sessionID, status;
    
    public AttendanceRecord(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, Date sessionDate, String topic, String recordStudentID, String sessionID, String status) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic);
        if (status != null && !status.equals("Present") && !status.equals("Absent")) throw new IllegalArgumentException("Status must be Present/Absent");
        this.recordStudentID = recordStudentID; this.sessionID = sessionID; this.status = status;
    }
    
    public String getStatus() { return status; }
}