package org.example.service;
import org.example.model.Instructor;
import org.example.model.Section;
import org.example.exceptions.DuplicateIDException;

public interface InstructorInterface {
    void addInstructor(Instructor instructor) throws DuplicateIDException;
    void assignInstructorToSection(Instructor instructor, Section section);
    void getInstructorDetails(int id);
    void updateInstructor(Instructor instructor, String name, String courses);
    String removeInstructor(Instructor instructor);
}