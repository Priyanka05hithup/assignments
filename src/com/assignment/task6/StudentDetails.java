package com.assignment.task6;

public class StudentDetails {
    String name;
    int EnrollmentNumber;
    public StudentDetails(String name,int EnrollmentNumber){
        this.name=name;
        this.EnrollmentNumber=EnrollmentNumber;

    }
    public static void main(String[] args) {
        StudentDetails sd=new StudentDetails("Amey",123);
        System.out.println("Student name is:"+sd.name);
        System.out.println("student EnrollNumber is:"+sd.EnrollmentNumber);

    }
}
