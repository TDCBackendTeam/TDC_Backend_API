package com.saikiran.consumerapp.model;

public class Student {

    private String studentId;
    private String studentName;
    private String studentEmail;

    public Student() {
    }

    public Student(String studentId, String studentName, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
