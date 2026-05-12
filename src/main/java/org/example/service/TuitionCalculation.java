package org.example.service;

import org.example.model.Course;
import org.example.model.Student;
import org.example.model.TuitionFeePayment;
import org.example.exceptions.InvalidPaymentAmountException;
import java.util.*;


public class TuitionCalculation implements TuitionInterface {

    public TuitionFeePayment calculateFee(Student student, Course course, double discountPercent) {
        TuitionFeePayment payment = new TuitionFeePayment(student.getID());
        double fee = payment.calculateTuitionFee(course.getUnits());

        System.out.print("Apply scholarship discount? (y/n): ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine().trim().toLowerCase();

        if (discountPercent > 0) {
            double discount = fee * (discountPercent / 100.0);
            double discountedFee = fee - discount;
            payment.setTotalTuition(discountedFee);
            System.out.printf("Full tuition:                PHP %.2f%n", fee);
            System.out.printf("Scholarship discount (%.0f%%): - PHP %.2f%n", discountPercent, discount);
            System.out.printf("Final tuition for %s:        PHP %.2f%n", student.getName(), discountedFee);
        } else {
            System.out.printf("Tuition for %s (%s): PHP %.2f%n",
                    student.getName(), course.getCourseName(), fee);
        }
        return payment;
    }

    public void makePayment(TuitionFeePayment payment, double amount) throws InvalidPaymentAmountException{
        if (amount <= 0) {
            throw new InvalidPaymentAmountException("Payment amount must be higher than 0.");
        }
        if (amount > payment.getRemainingBalance()) {
            throw new InvalidPaymentAmountException("Overpayment's not allowed. Remaining balance is P"
                    + payment.getRemainingBalance());
        }
        payment.makePayment(amount);
        System.out.println("Payment: " + amount + ". Remaining payment is P"
                + payment.getRemainingBalance());
    }

    public double getRemainingBalance(TuitionFeePayment payment) {
        return payment.getRemainingBalance();
    }
}