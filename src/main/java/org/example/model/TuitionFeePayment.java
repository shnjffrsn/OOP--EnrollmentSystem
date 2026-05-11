package org.example.model;

public class TuitionFeePayment {
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
}
