package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Student student = new Student();
        student.setStudentID("2024898392B");
        student.setName("Michael Jackstone");
        student.setProgram("BSIT");
        System.out.println("Student ID: " + student.studentID);
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Program: " + student.program);

        Course course = new Course();
        course.setCourseID("123372");
        course.setCourseName("Inteprog");
        course.setProgram("BSIT");
        System.out.println("Course ID: " + course.courseID);
        System.out.println("Course Name: " + course.courseName);
        System.out.println("Program: " + course.program);
    }
}
