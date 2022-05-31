package com.example.jwt.student;

public class Student {

    private final Integer studentId;
    private final String StudentName;


    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.StudentName = studentName;

    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", StudentName='" + StudentName + '\'' +
                '}';
    }

}
