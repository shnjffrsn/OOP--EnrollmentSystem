package org.example.service;
import org.example.model.Course;
import java.util.*;

public class CourseEnrollment implements CourseInterface{
    ArrayList<Course> courseList = new ArrayList<>();

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void displayAllCourse() {
        System.out.println(courseList);
    }

    public void updateCourse(Course course) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID() == course.getCourseID()) {
                courseList.set(i, course);
                System.out.println("Successfully Updated.");
                return;
            }
        }
    }

    public String deleteCourse(Course course) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID() == (course.getCourseID())) {
                courseList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
