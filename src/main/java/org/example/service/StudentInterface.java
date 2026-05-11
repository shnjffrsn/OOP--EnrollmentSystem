package org.example.service;
import org.example.model.Student;

public interface StudentInterface {
    void addStudent(Student student);
    void displayAllStudents();
    void updateStudent(Student student);
    String deleteStudent(Student student);
}