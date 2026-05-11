package org.example.service;

import org.example.model.Course;
import org.example.model.Student;
import org.example.model.TuitionFeePayment;
import org.example.exceptions.InvalidPaymentAmountException;


public interface TuitionInterface {
    TuitionFeePayment calculateFee(Student student, Course course);
    void makePayment(TuitionFeePayment payment, double amount) throws InvalidPaymentAmountException;
    double getRemainingBalance(TuitionFeePayment payment);
}
