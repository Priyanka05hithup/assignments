package com.assignment.task6;

import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;

    private Student(String name) {
        this.name = name;
    }

    private Student() {
        this.name = "Unknown";
    }

    public static void main(String[] args) {
        Student student = new Student("Priyanka");
        Student unknownStudent = new Student();
        Student thirdStudent = new Student("Sandro");

        List<Student> students = Arrays.asList(student,unknownStudent,thirdStudent);
        printStudentsNames(students);
    }

    private static void printStudentsNames(List<Student> students) {
        students.forEach(student -> {
            System.out.println(student.name);
        });
    }
}
