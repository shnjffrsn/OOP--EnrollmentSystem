package org.example.service;
import org.example.model.Course;
import org.example.exceptions.DuplicateIDException;


public interface CourseInterface {
    void addCourse(Course course)  throws DuplicateIDException ;
    void displayAllCourse();
    void updateCourse(Course course);
    String deleteCourse(Course course);
}
