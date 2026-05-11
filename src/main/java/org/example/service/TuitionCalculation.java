package org.example.service;

import org.example.model.Course;
import org.example.model.Student;
import org.example.model.TuitionFeePayment;

public class TuitionCalculation implements TuitionInterface {

    public TuitionFeePayment calculateFee(Student student, Course course) {
        TuitionFeePayment payment = new TuitionFeePayment(student.getID());
        double fee = payment.calculateTuitionFee(course.getUnits());
        System.out.println("PHP " + fee + " for " + student.getName());
        return payment;
    }

    public void makePayment(TuitionFeePayment payment, double amount) {
        if (amount <= 0) {
            System.out.println("Payment amount must be higher than 0.");
            return;
        }
        if (amount > payment.getRemainingBalance()) {
            System.out.println("Overpayment's not allowed. Remaining balance is P"
                    + payment.getRemainingBalance());
            return;
        }
        payment.makePayment(amount);
        System.out.println("Payment: " + amount + ". Remaining payment is P"
                + payment.getRemainingBalance());
    }

    public double getRemainingBalance(TuitionFeePayment payment) {
        return payment.getRemainingBalance();
    }
}