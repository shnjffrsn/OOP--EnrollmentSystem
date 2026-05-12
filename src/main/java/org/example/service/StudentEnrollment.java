package org.example.service;
import org.example.model.Student;
import java.util.*;
import org.example.exceptions.DuplicateIDException;

public class StudentEnrollment implements StudentInterface{
    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) throws DuplicateIDException {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getID() == student.getID()) {
                throw new DuplicateIDException("Student with ID " + student.getID() + " already exists.");
            }
        }
        studentList.add(student);
    }

    public void displayAllStudents(){
        System.out.println(studentList);
    }

        public void updateStudent(Student student, String name, String program) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getID() == student.getID()) {
                studentList.set(i, new Student(student.getID(), name, program));
                System.out.println("Successfully Updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public String deleteStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getID() == (student.getID())) {
                studentList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Student not found";
    }
}
