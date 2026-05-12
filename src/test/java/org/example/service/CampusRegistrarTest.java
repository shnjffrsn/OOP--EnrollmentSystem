package org.example.service;

import org.example.exceptions.DuplicateIDException;
import org.example.exceptions.SectionFullException;
import org.example.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampusRegistrarTest {

    private StudentEnrollment studentEnrollment;
    private CourseEnrollment   courseEnrollment;
    private InstructorAssignment instructorAssignment;
    private EnrollmentAService enrollmentService;

    @BeforeEach
    void setUp() {
        studentEnrollment    = new StudentEnrollment();
        courseEnrollment     = new CourseEnrollment();
        instructorAssignment = new InstructorAssignment();
        enrollmentService    = new EnrollmentAService();
    }


    @Test
    void addStudent_duplicateID_throwsDuplicateIDException() throws DuplicateIDException {
        Student s1 = new Student(1, "Alice", "BSIT");
        Student s2 = new Student(1, "Bob",   "BSCS");

        studentEnrollment.addStudent(s1);

        assertThrows(DuplicateIDException.class,
                () -> studentEnrollment.addStudent(s2),
                "Should throw DuplicateIDException when adding a student with an existing ID");
    }

    @Test
    void updateStudent_notFound_doesNotThrowAndListUnchanged() {
        Student stud = new Student(99, "Annie", "BSIT");

        assertDoesNotThrow(() -> studentEnrollment.updateStudent(stud, "Manny", "BSCS"), "updateStudent on a non-existent student must not throw");
        String result = studentEnrollment.deleteStudent(stud);
        assertEquals("Student not found", result, "List should still be empty after a failed update");
    }

    @Test
    void deleteStudent_existingStudent_returnsSuccessMessage() throws DuplicateIDException {
        Student stud = new Student(2, "Jane Don't", "BSIT");
        studentEnrollment.addStudent(stud);

        String result = studentEnrollment.deleteStudent(stud);

        assertEquals("Successfully Deleted", result, "Deleting an existing student should return 'Successfully Deleted'");
    }


    @Test
    void addCourse_duplicateID_throwsDuplicateIDException() throws DuplicateIDException {
        Course c1 = new Course(101, "Programming 1", "BSIT", 3);
        Course c2 = new Course(101, "Programming 2", "BSCS", 3);

        courseEnrollment.addCourse(c1);

        assertThrows(DuplicateIDException.class, () -> courseEnrollment.addCourse(c2), "Should throw DuplicateIDException when adding a course with an existing ID");
    }

    @Test
    void updateCourse_notFound_doesNotThrowAndListUnchanged() {
        Course cor = new Course(999, "5 Course Meal", "BSIT", 3);

        assertDoesNotThrow(() -> courseEnrollment.updateCourse(cor), "updateCourse on a non-existent course must not throw");

        String result = courseEnrollment.deleteCourse(cor);
        assertEquals("Course not found.", result, "List should still be empty after a failed course update");
    }


    @Test
    void updateInstructor_notFound_doesNotThrow() {
        Instructor ins = new Instructor(77, "Mr. Mister Yee", "Secret2");

        assertDoesNotThrow(() -> instructorAssignment.updateInstructor(ins, "America", "Ofcourse"), "updateInstructor on a non-existent instructor must not throw");

        String result = instructorAssignment.removeInstructor(ins);
        assertEquals("Instructor not found.", result, "List should be empty after a failed instructor update");
    }


    @Test
    void enrollStudentInSection_sectionFull_throwsSectionFullException() throws SectionFullException {
        Section section = new Section(1, "IT301", 1);
        Student s1 = new Student(1, "Annie", "BSIT");
        Student s2 = new Student(2, "Bernie",   "BSIT");

        enrollmentService.enrollStudentInSection(s1, section);

        assertThrows(SectionFullException.class, () -> enrollmentService.enrollStudentInSection(s2, section), "Should throw SectionFullException when section is full");
    }

    @Test
    void enrollStudentInSection_duplicateEnrollment_doesNotAddTwice() throws SectionFullException {
        Section section = new Section(2, "IT302", 10);
        Student s = new Student(3, "Diana", "BSIT");

        enrollmentService.enrollStudentInSection(s, section);
        enrollmentService.enrollStudentInSection(s, section);

        assertEquals(1, section.getEnrolledStudents().size(), "A student enrolled twice should still appear only once in the section");
    }

    @Test
    void makePayment_overpayment_throwsInvalidPaymentAmountException() {
        TuitionFeePayment payment = new TuitionFeePayment(1);
        payment.calculateTuitionFee(3);

        org.example.service.TuitionCalculation tuition = new org.example.service.TuitionCalculation();

        assertThrows(org.example.exceptions.InvalidPaymentAmountException.class, () -> tuition.makePayment(payment, 9999.00), "Should throw InvalidPaymentAmountException when payment exceeds remaining balance");
    }


    @Test
    void makePayment_zeroAmount_throwsInvalidPaymentAmountException() {
        TuitionFeePayment payment = new TuitionFeePayment(2);
        payment.calculateTuitionFee(3);

        org.example.service.TuitionCalculation tuition = new org.example.service.TuitionCalculation();

        assertThrows(org.example.exceptions.InvalidPaymentAmountException.class, () -> tuition.makePayment(payment, 0), "Should throw InvalidPaymentAmountException when payment amount is zero");
    }
}
