package org.example.service;

import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;
import org.example.exceptions.SectionFullException;

public interface EnrollmentInterface {
    void enrollStudentInSection(Student student, Section section) throws SectionFullException;
    void viewDepartmentHierarchy(Department department);
}
