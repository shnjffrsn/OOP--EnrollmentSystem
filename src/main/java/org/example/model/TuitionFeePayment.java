package org.example.model;

public class TuitionFeePayment {
    private static final double PRICE_PER_UNIT = 1000.00;
    private int studentID;
    private double totalTuition;
    private double amountPaid;

    public TuitionFeePayment(int studentID) {
        this.studentID = studentID;
        this.totalTuition = 0;
        this.amountPaid = 0;
    }

    public int getStudentID(){
        return studentID;
    }

    public double getTotalTuition(){
        return totalTuition;
    }

    public double getAmountPaid(){
        return amountPaid;
    }

    public void setTotalTuition(double totalTuition){
        this.totalTuition = totalTuition;
    }

    public void setAmountPaid(double amountPaid){
        this.amountPaid = amountPaid;
    }

    public double calculateTuitionFee(int units){
        totalTuition = units * PRICE_PER_UNIT;
        return totalTuition;
    }

    public void makePayment(double amount){
        amountPaid += amount;
    }

    public double getRemainingBalance(){
        return totalTuition - amountPaid;
    }

    public boolean isFullyPaid(){
        return getRemainingBalance() == 0;
    }
}
