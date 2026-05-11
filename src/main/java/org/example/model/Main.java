package org.example.model;

public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor(72811, "Ms. Take", "Dismath");
        Student student = new Student(123, "Manny Pacquiao", "BSFS");
        Course course = new Course(321, "Inteprog", "BSFS", 3);
        TuitionFeePayment payment = new TuitionFeePayment(123322);

        instructor.setName("Mang Juan");
        System.out.println(instructor);
        student.setID(123);
        student.setName("Manny Pacquiao");
        student.setProgram("BSFS");
        System.out.println(student.getID());
        System.out.println(student.getName());
        System.out.println(student.getProgram());

        course.setCourseID(321);
        course.setCourseName("Inteprog");
        course.setProgram("BSFS");
        System.out.println(course.getCourseID());
        System.out.println(course.getCourseName());
        System.out.println(course.getProgram());

//        double total = payment.calculateTuitionFee(3, 0.10);
//        System.out.println("Total Tuition Fee: " + total);
//
//        payment.makePayment(1500.00);
//
//        System.out.println("Remaining Balance: " + payment.getRemainingBalance());
//        System.out.println("Is Fully Paid? " + payment.isFullyPaid());
//
//        payment.makePayment(payment.getRemainingBalance());

        System.out.println("Final Balance: " + payment.getRemainingBalance());
        System.out.println("Is Fully Paid? " + payment.isFullyPaid());


    }
}

//        TuitionFeePayment tuitionFeePayment = new TuitionFeePayment();
//        System.out.println(tuitionFeePayment.calculateTuitionFee(3, 0.10));
//        tuitionFeePayment.makePayment(1000);
//        System.out.println(tuitionFeePayment.getRemainingBalance());

//        Scanner input = new Scanner(System.in);

//    StudentEnrollment studentEnrollment = new StudentEnrollment();
//    CourseEnrollment courseEnrollment = new CourseEnrollment();
//
//            while (true){
//                System.out.println("1. Add Student");
//                System.out.println("2. Display Students");
//                System.out.println("3. Update Student");
//                System.out.println("4. Delete Student");
//                System.out.println("5. Add Course");
//                System.out.println("6. Display Course");
//                System.out.println("7. Update Course");
//                System.out.println("8. Delete Course");
//                System.out.print("Choose Number: ");
//                int choice = input.nextInt();
//                input.nextLine();
//
//                switch (choice) {
//                case 1:
//                    System.out.print("Enter ID: ");
//                    int studentID = input.nextInt();
//                        input.nextLine();
//                        System.out.print("Enter Name: ");
//
//                        String name = input.nextLine();
//                        System.out.print("Enter Program: ");
//
//                        String program = input.nextLine();
//
//                        studentEnrollment.addStudent(new Student(studentID, name, program));
//                        break;
//
//            case 2:
//            studentEnrollment.displayAllStudents();
//            break;
//
//            case 3:
//                System.out.println("Enter ID: ");
//                int searchStuID = input.nextInt();
//                studentEnrollment.updateStudent(new Student(searchStuID, "", ""));
//                break;
//
//            case 4:
//                System.out.print("Enter ID: ");
//
//                int delStuID = input.nextInt();
//                String delStu = studentEnrollment.deleteStudent(new Student(delStuID, "", ""));
//                        System.out.println(delStu);
//
//                        break;
//
//
//            case 5:
//                System.out.print("Enter ID: ");
//                int courseID = input.nextInt();
//
//                System.out.print("Enter Name: ");
//    String courseName = input.nextLine();
//
//                        System.out.print("Enter Program: ");
//    String courseProgram = input.nextLine();
//
//                        courseEnrollment.addCourse(new Course(courseID, courseName, courseProgram));
//            break;
//
//            case 6:
//            courseEnrollment.displayAllCourse();
//                        break;
//
//                                case 7:
//                                System.out.print("Enter ID: ");
//    int searchCoID = input.nextInt();
//                        courseEnrollment.updateCourse(new Course(searchCoID, "", ""));
//            break;
//
//            case 8:
//            System.out.print("Enter ID: ");
//    int delCoID = input.nextInt();
//    String delCo = courseEnrollment.deleteCourse(new Course(delCoID, "", ""));
//                        System.out.println(delCo);
//                        break;
//
//                        case 9:
//                                return;
//
//    default:
//            System.out.println("Error");

//            }
//        }


//        // Create
//        studentEnrollment.addStudent(new Student(123, "Apple", "BSIT"));
//        studentEnrollment.addStudent(new Student(456, "Banana", "BSFS"));
//        studentEnrollment.addStudent(new Student(789, "Carrot", "BSN"));
//
//        courseEnrollment.addCourse(new Course(108, "Infoman1", "BSIT"));
//        courseEnrollment.addCourse(new Course(765, "Linusyst", "BSIT"));
//        courseEnrollment.addCourse(new Course(432, "Artapre", "BSIT"));
//
//        // Read
//        studentEnrollment.displayAllStudents();
//        courseEnrollment.displayAllCourse();
//
//        // Update
//        studentEnrollment.updateStudent(new Student(123, "David", "BSIT"));
//        courseEnrollment.updateCourse(new Course(108, "Infoman", "BSTM"));
//
//        studentEnrollment.displayAllStudents();
//        courseEnrollment.displayAllCourse();
//
//        // Delete
//        studentEnrollment.deleteStudent(new Student(123, "David", "BSIT"));
//        courseEnrollment.deleteCourse(new Course(108, "Infoman", "BSTM"));
//
//        studentEnrollment.displayAllStudents();
//        courseEnrollment.displayAllCourse();
//    }
//}



