package org.example.model;
import org.example.service.CampusRegistrar;

import java.util.Scanner;

public class Main {

    public static CampusRegistrar registrar = new CampusRegistrar();
    public static Scanner input = new Scanner(System.in);

    public static Department dept = new Department("College of Information Technology");
    public static TuitionFeePayment activePayment = null;

    public static void main(String[] args){
        System.out.println("Campus Registrar System");

        while (true) {
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Instructor Management");
            System.out.println("4. Section and Enrollment");
            System.out.println("5. Tuition and Payment");
            System.out.println("6. Exit");
            System.out.print("Choose Number: ");
            int choice = nextInt();

            switch (choice) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    courseMenu();
                    break;
                case 3:
                    instructorMenu();
                    break;
                case 4:
                    sectionMenu();
                    break;
                case 5:
                    tuitionMenu();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Error");
            }
        }
    }

    public static void studentMenu(){
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Back");
            System.out.print("Choose Number: ");
        int choice = nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                int id = nextInt();

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Program: ");
                String program = input.nextLine();

                registrar.addStudent(new Student(id, name, program));
                break;

            case 2:
                registrar.displayAllStudents();
                break;

            case 3:
                System.out.print("Enter ID: ");
                int uid = nextInt();

                System.out.print("Enter New Name: ");
                String uname = input.nextLine();

                System.out.print("Enter New Program: ");
                String uprog = input.nextLine();

                registrar.updateStudent(new Student(uid, uname, uprog), uname, uprog);
                break;

            case 4:
                System.out.print("Enter ID: ");
                int did = nextInt();

                System.out.println(registrar.deleteStudent(new Student(did, "", "")));
                break;

            case 5:
                return;

            default:
                System.out.println("Error");
            }
        }
    }

    public static void courseMenu() {
        while (true) {
            System.out.println("1. Add Course");
            System.out.println("2. Display All Courses");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Back");
            System.out.print("Choose Number: ");
            int choice = nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = nextInt();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Program: ");
                    String program = input.nextLine();

                    System.out.print("Enter Units: ");
                    int units = nextInt();

                    registrar.addCourse(new Course(id, name, program, units));
                    break;

                case 2:
                    registrar.displayAllCourses();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int uid = nextInt();

                    System.out.print("Enter New Name: ");
                    String uname = input.nextLine();

                    System.out.print("Enter New Program: ");
                    String uprog = input.nextLine();

                    System.out.print("Enter New Units: ");
                    int uunits = nextInt();

                    registrar.updateCourse(new Course(uid, uname, uprog, uunits));
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int did = nextInt();

                    System.out.println(registrar.deleteCourse(new Course(did, "", "", 0)));
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Error");
            }
        }
    }

    public static void instructorMenu() {
        while (true) {
            System.out.println("1. Add Instructor");
            System.out.println("2. Get Instructor Details");
            System.out.println("3. Update Instructor");
            System.out.println("4. Delete Instructor");
            System.out.println("5. Back");
            System.out.print("Choose Number: ");
            int choice = nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = nextInt();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Course(s): ");
                    String courses = input.nextLine();

                    registrar.addInstructor(new Instructor(id, name, courses));
                    break;

                case 2:
                    System.out.print("Enter Instructor ID: ");
                    int sid = nextInt();

                    registrar.getInstructorDetails(sid);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int uid = nextInt();

                    System.out.print("Enter New Name: ");
                    String uname = input.nextLine();

                    System.out.print("Enter New Program: ");
                    String uprog = input.nextLine();

                    registrar.updateInstructor(new Instructor(uid, uname, uprog), uname, uprog);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int did = nextInt();

                    System.out.println(registrar.removeInstructor(new Instructor(did, "", "")));
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Error");
            }
        }
    }

    public static void sectionMenu() {
        while (true) {
            System.out.println("1. Add Department with Section");
            System.out.println("2. Add Section to Department");
            System.out.println("3. Enroll Student in Section");
            System.out.println("4. Assign Instructor to Section");
            System.out.println("5. View Department Hierarchy");
            System.out.println("6. Back");
            System.out.print("Choose Number: ");
            int choice = nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Department Name: ");
                    String departmentName = input.nextLine();
                    dept = new Department(departmentName);

                    System.out.print("Enter Section ID: ");
                    int secID = nextInt();

                    System.out.print("Enter Section Name: ");
                    String secName = input.nextLine();

                    System.out.print("Enter Max Capacity: ");
                    int maxCap = nextInt();

                    Section newSec = new Section(secID, secName, maxCap);

                    registrar.addSectionToDepartment(dept, newSec);
                    break;

                case 2:
                    System.out.print("Enter Section ID: ");
                    int sid = nextInt();

                    System.out.print("Enter Section Name: ");
                    String sname = input.nextLine();

                    System.out.print("Enter Max Capacity: ");
                    int cap = nextInt();

                    registrar.addSectionToDepartment(dept, new Section(sid, sname, cap));
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int studentID = nextInt();

                    System.out.print("Enter Student Name: ");
                    String sStudentName = input.nextLine();

                    System.out.print("Enter Program: ");
                    String prog = input.nextLine();
                    if (dept.getSections().isEmpty()) {
                        System.out.println("No sections available. Add a section first.");
                        break;
                    }

                    System.out.println("Select Section:");
                    for (int i = 0; i < dept.getSections().size(); i++) {
                        System.out.println((i + 1) + ". " + dept.getSections().get(i).getSectionName());
                    }
                    System.out.print("Choose: ");
                    int secChoice = nextInt();
                    if (secChoice < 1 || secChoice > dept.getSections().size()) {
                        System.out.println("Invalid section.");
                        break;
                    }

                    registrar.enrollStudentInSection(new Student(studentID, sStudentName, prog), dept.getSections().get(secChoice - 1));
                    break;

                case 4:
                    System.out.print("Enter Instructor ID: ");
                    int instrID = nextInt();
                    if (dept.getSections().isEmpty()) {
                        System.out.println("No sections available. Add a section first.");
                        break;
                    }

                    System.out.println("Select Section:");
                    for (int i = 0; i < dept.getSections().size(); i++) {
                        System.out.println((i + 1) + ". " + dept.getSections().get(i).getSectionName());
                    }

                    System.out.print("Choose: ");
                    int assignChoice = nextInt();
                    if (assignChoice < 1 || assignChoice > dept.getSections().size()) {
                        System.out.println("Invalid section.");
                        break;
                    }

                    registrar.assignInstructorToSection(new Instructor(instrID, "", ""), dept.getSections().get(assignChoice - 1));
                    break;

                case 5:
                    registrar.viewDepartmentHierarchy(dept);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Error");
            }
        }
    }

    public static void tuitionMenu() {
        while (true) {
            System.out.println("1. Calculate Tuition Fee");
            System.out.println("2. Make Payment");
            System.out.println("3. Check Remaining Balance");
            System.out.println("4. Back");
            System.out.print("Choose Number: ");
            int choice = nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentID = nextInt();

                    System.out.print("Enter Student Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Program: ");
                    String prog = input.nextLine();

                    System.out.print("Enter Course ID: ");
                    int courseID = nextInt();

                    System.out.print("Enter Course Name: ");
                    String cName = input.nextLine();

                    System.out.print("Enter Units: ");
                    int units = nextInt();

                    System.out.print("Apply scholarship discount? (y/n): ");
                    String applyDiscount = input.nextLine().trim().toLowerCase();
                    double discountPercent = 0;
                    if (applyDiscount.equals("y")) {
                        System.out.print("Enter discount (e.g. 50 = 50%): ");
                        discountPercent = nextDouble();
                    }

                    activePayment = registrar.calculateFee(new Student(studentID, name, prog), new Course(courseID, cName, prog, units), discountPercent);
                    break;

                case 2:
                    if (activePayment == null) {
                        System.out.println("Please calculate a fee first.");
                    } else {
                        System.out.print("Enter payment amount: PHP ");
                        double amount = nextDouble();

                        registrar.makePayment(activePayment, amount);
                    }
                    break;

                case 3:
                    if (activePayment == null) {
                        System.out.println("No active payment. Calculate a fee first.");
                    } else {
                        System.out.printf("Remaining Balance: PHP %.2f%n", registrar.getRemainingBalance(activePayment));
                        if (activePayment.isFullyPaid())
                            System.out.println("Status: FULLY PAID");
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Error");
            }
        }
    }

    public static int nextInt() {
        while (true){
            try{
                return Integer.parseInt(input.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.print("Please enter a valid number: ");
            }
        }
    }

    public static double nextDouble(){
        while (true){
            try{
                return Double.parseDouble(input.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.print("Please enter a valid amount: ");
            }
        }
    }

}