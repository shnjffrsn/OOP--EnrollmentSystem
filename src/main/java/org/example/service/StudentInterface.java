package org.example.service;
import org.example.model.Student;
import org.example.exceptions.DuplicateIDException;



public interface StudentInterface {
    void addStudent(Student student) throws DuplicateIDException;
    void displayAllStudents();
    void updateStudent(Student student, String name, String program);
    String deleteStudent(Student student);
}