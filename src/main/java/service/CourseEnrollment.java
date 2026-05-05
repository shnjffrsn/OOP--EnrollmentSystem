package service;
import org.example.model.Course;
import java.util.*;

public class CourseEnrollment {
    private ArrayList<Course> courseList = new ArrayList<>();
//    private Scanner input = new Scanner(System.in);

    public void addCourse(Course course) {
        courseList.add(course);
    }

    // Read
    public void displayAllCourse() {
        System.out.println(courseList);
    }

    // Updates
//    public void updateCourse(Course course) {
//        for (int i = 0; i < courseList.size(); i++) {
//            if (courseList.get(i).getCourseID() == course.getCourseID()) {
//
//                System.out.print("Enter course name: ");
//                String courseName = input.nextLine();
//
//                System.out.print("Enter program: ");
//                String program = input.nextLine();
//
//                courseList.set(i, new Course(course.getCourseID(), courseName, program));
//                break;
//            }
//        }
//    }

    // Delete
//    public String deleteCourse(Course course) {
//        for (int i = 0; i < courseList.size(); i++) {
//            if (courseList.get(i).getCourseID() == (course.getCourseID())) {
//                courseList.remove(i);
//                return "Successfully Deleted";
//            }
//        }
//        return "Error";
//    }
}
