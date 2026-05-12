package org.example.service;
import org.example.model.Student;
import java.util.*;
import org.example.exceptions.DuplicateIDException;


public class StudentEnrollment {
    ArrayList<Student> studentList = new ArrayList<>();
    Scanner input = new Scanner (System.in);

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

    public void updateStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getID() == student.getID()) {

                System.out.print("Enter name: ");
                String name = input.nextLine();

                System.out.print("Enter program: ");
                String program = input.nextLine();

                studentList.set(i, new Student(student.getID(), name, program));
                break;
            }
        }
    }

    public String deleteStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getID() == (student.getID())) {
                studentList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
