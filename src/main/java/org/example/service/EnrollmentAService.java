package org.example.service;

import org.example.model.Department;
import org.example.model.Instructor;
import org.example.model.Section;
import org.example.model.Student;
import org.example.exceptions.SectionFullException;


public class EnrollmentAService implements EnrollmentInterface {

    public void enrollStudentInSection(Student student, Section section) throws SectionFullException {
        for (int i = 0; i < section.getEnrolledStudents().size(); i++) {
            Student s = section.getEnrolledStudents().get(i);
            if (s.getID() == student.getID()) {
                System.out.println("Student already enrolled in this section.");
                return;
            }
        }
        if (section.getEnrolledStudents().size() >= section.getMaxCapacity()) {
            throw new SectionFullException("Enrollment failed: Section '" + section.getSectionName() + "' is currently full ("
                    + section.getMaxCapacity() + "/" + section.getMaxCapacity() + ").");
        }
        section.getEnrolledStudents().add(student);
        System.out.println(student.getName() + " enrolled in " + section.getSectionName());
    }

    public void viewDepartmentHierarchy(Department department) {
        System.out.println("Department: " + department.getDepartmentName());
        if (department.getSections().isEmpty()) {
            System.out.println("No sections found.");
            return;
        }
        for (int i = 0; i < department.getSections().size(); i++) {
            Section sec = department.getSections().get(i);
            System.out.println("\nSection: " + sec.getSectionName()
                    + " [" + sec.getEnrolledStudents().size() + "/" + sec.getMaxCapacity() + "]");
            Instructor instr = sec.getInstructor();
            if (instr != null) {
                System.out.println("Instructor: " + instr.getName());
            } else {
                System.out.println("Instructor: No instructor assigned");
            }
            System.out.println("Students:");
            if (sec.getEnrolledStudents().isEmpty()) {
                System.out.println("  No students enrolled.");
            } else {
                for (int j = 0; j < sec.getEnrolledStudents().size(); j++) {
                    Student student = sec.getEnrolledStudents().get(j);
                    System.out.println("  - " + student);
                }
            }
        }
    }
}