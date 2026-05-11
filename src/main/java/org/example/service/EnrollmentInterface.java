package org.example.service;

import org.example.model.Department;
import org.example.model.Section;
import org.example.model.Student;

public interface EnrollmentInterface {
    void enrollStudentInSection(Student student, Section section);
    void viewDepartmentHierarchy(Department department);
}
