package org.example.service;
import org.example.model.Instructor;
import org.example.model.Section;

public interface InstructorInterface {
    void addInstructor(Instructor instructor);
    void assignInstructorToSection(Instructor instructor, Section section);
    void getInstructorDetails(int id);
}