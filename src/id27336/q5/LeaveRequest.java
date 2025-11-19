package id27336.q5;

import java.util.Date;

public class LeaveRequest extends AttendanceRecord {
    private Date requestDate;
    private String reason;
    private boolean approved;
    
    public LeaveRequest(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, Date sessionDate, String topic, String recordStudentID, String sessionID, String status, Date requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, recordStudentID, sessionID, status);
        if (reason == null || reason.isEmpty()) throw new IllegalArgumentException("Reason cannot be empty");
        this.requestDate = requestDate; this.reason = reason; this.approved = approved;
    }
    
    public boolean isApproved() { return approved; }
}