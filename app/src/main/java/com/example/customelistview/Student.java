package com.example.customelistview;

import java.io.Serializable;

public class Student implements Serializable {

    private int studentId;
    private String studentName;
    private String studentCountry;

    public Student() {
    }

    public Student(int employeeId, String employeeName, String countryName)
    {
        this.studentId = employeeId;
        this.studentName = employeeName;
        this.studentCountry = countryName;
    }

    public String getstudentCountry()
    {
        return studentCountry;
    }

    public void setCountryName(String studentCountry)
    {
        this.studentCountry = studentCountry;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "employeeId=" + studentId +
                ", employeeName='" + studentName + '\'' +
                ", countryName='" + studentCountry + '\'' +
                '}';
    }
}
