package id27336.q5;

import java.util.Date;

public final class AttendanceSummary extends LeaveRequest {
    private Date reportDate;
    private int totalPresent, totalAbsent;
    
    public AttendanceSummary(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, Date sessionDate, String topic, String recordStudentID, String sessionID, String status, Date requestDate, String reason, boolean approved, Date reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, recordStudentID, sessionID, status, requestDate, reason, approved);
        this.reportDate = reportDate; this.totalPresent = totalPresent; this.totalAbsent = totalAbsent;
    }
    
    public double generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        return totalSessions > 0 ? (totalPresent * 100.0) / totalSessions : 0;
    }
    
    public int getTotalPresent() { return totalPresent; }
    public int getTotalAbsent() { return totalAbsent; }
}