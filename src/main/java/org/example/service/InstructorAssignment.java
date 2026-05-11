package org.example.service;
import org.example.model.Instructor;
import org.example.model.Section;
import java.util.*;

public class InstructorAssignment implements InstructorInterface {
    ArrayList<Instructor> instructorList = new ArrayList<>();

    public void addInstructor(Instructor instructor) {
        instructorList.add(instructor);
    }

    public void assignInstructorToSection(Instructor instructor, Section section) {
        for (int i = 0; i < instructorList.size(); i++) {
            if (instructorList.get(i).getID() == instructor.getID()) {
                section.setInstructor(instructorList.get(i));
                System.out.println("Successfully assigned.");
                return;
            }
        }
        System.out.println("Instructor not found.");
    }

    public void getInstructorDetails(int id) {
        for (int i = 0; i < instructorList.size(); i++) {
            if (instructorList.get(i).getID() == id) {
                Instructor inst = instructorList.get(i);
                System.out.println("Instructor Details");
                System.out.println("Name: " + inst.getName());
                System.out.println("Courses: " + inst.getCourses());
                return;
            }
        }
        System.out.println("Instructor not found.");
    }
}