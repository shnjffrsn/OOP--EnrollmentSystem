package service;
import org.example.model.Student;
import java.util.*;

public class StudentEnrollment {
    private ArrayList<Student> studentList = new ArrayList<>();
    private Scanner input = new Scanner (System.in);

    public void addStudent (Student student){
        studentList.add(student);
    }

    // Read
    public void displayAllStudents(){
        System.out.println(studentList);
    }

    // Updates
    public void updateStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID() == student.getStudentID()) {

                System.out.print("Enter name: ");
                String studentName = input.nextLine();

                System.out.print("Enter program: ");
                String program = input.nextLine();

                studentList.set(i, new Student(student.getStudentID(), studentName, program));
                break;
            }
        }
    }

    // Delete
    public String  deleteStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID() == (student.getStudentID())) {
                studentList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
