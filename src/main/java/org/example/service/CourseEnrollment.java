package org.example.service;
import org.example.model.Course;
import java.util.*;

public class CourseEnrollment {
    ArrayList<Course> courseList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void displayAllCourse() {
        System.out.println(courseList);
    }

    public void updateCourse(Course course) {
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseID() == course.getCourseID()) {

                System.out.print("Enter course name: ");
                String courseName = input.nextLine();

                System.out.print("Enter program: ");
                String program = input.nextLine();

                courseList.set(i, new Course(course.getCourseID(), courseName, program));
                break;
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
