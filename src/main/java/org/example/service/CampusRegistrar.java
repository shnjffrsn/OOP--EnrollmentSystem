package org.example.service;

import org.example.model.*;
import org.example.exceptions.*;

public class CampusRegistrar {

    private final StudentEnrollment studentEnrollment = new StudentEnrollment();
    private final CourseEnrollment courseEnrollment = new CourseEnrollment();
    private final InstructorAssignment instructorAssignment = new InstructorAssignment();
    private final EnrollmentAService enrollmentService = new EnrollmentAService();
    private final TuitionCalculation tuitionCalculation = new TuitionCalculation();

    public void addStudent(Student student) {
        try {
            studentEnrollment.addStudent(student);
            System.out.println("Student added: " + student.getName());
        } catch (DuplicateIDException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayAllStudents() {
        studentEnrollment.displayAllStudents();
    }

    public void updateStudent(Student student, String name, String program) {
        studentEnrollment.updateStudent(student, name, program);
    }

    public String deleteStudent(Student student) {
            return studentEnrollment.deleteStudent(student);
    }

    public void addCourse(Course course) {
        try {
        courseEnrollment.addCourse(course);
        System.out.println("Course added: " + course.getCourseName());
        } catch (DuplicateIDException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayAllCourses() {
        courseEnrollment.displayAllCourse();
    }

    public void updateCourse(Course course) {
        courseEnrollment.updateCourse(course);
    }

    public String deleteCourse(Course course) {
        return courseEnrollment.deleteCourse(course);
    }

    public void addInstructor(Instructor instructor) {
        try {
            instructorAssignment.addInstructor(instructor);
            System.out.println("Instructor added: " + instructor.getName());
        } catch (DuplicateIDException e) {
            System.out.println(e.getMessage());
        }
    }

    public void assignInstructorToSection(Instructor instructor, Section section) {
        instructorAssignment.assignInstructorToSection(instructor, section);
    }

    public void updateInstructor(Instructor instructor, String name, String courses) {
        instructorAssignment.updateInstructor(instructor, name, courses);
    }

    public String removeInstructor(Instructor instructor) {
        return instructorAssignment.removeInstructor(instructor);
    }

    public void addSectionToDepartment(Department department, Section section) {
        department.setSection(section);
        System.out.println("Section " + section.getSectionName() + " added to " + department.getDepartmentName());
    }

    public void getInstructorDetails(int id) {
        instructorAssignment.getInstructorDetails(id);
    }

    public void enrollStudentInSection(Student student, Section section) {
        try {
            enrollmentService.enrollStudentInSection(student, section);
        } catch (SectionFullException e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewDepartmentHierarchy(Department department) {
        enrollmentService.viewDepartmentHierarchy(department);
    }

    public TuitionFeePayment calculateFee(Student student, Course course) {
        return tuitionCalculation.calculateFee(student, course);
    }

    public void makePayment(TuitionFeePayment payment, double amount) {
        try {
            tuitionCalculation.makePayment(payment, amount);
        } catch (InvalidPaymentAmountException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
    }

    public double getRemainingBalance(TuitionFeePayment payment) {
        return tuitionCalculation.getRemainingBalance(payment);
    }
}