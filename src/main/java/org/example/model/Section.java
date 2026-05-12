package org.example.model;

import java.util.*;

public class Section {
    int sectionID;
    String sectionName;
    int maxCapacity;
    Instructor instructor;
    ArrayList<Student> studentsEnrolled;

    public Section(int sectionID, String sectionName, int maxCapacity) {
        this.sectionID = sectionID;
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
        this.studentsEnrolled = new ArrayList<>();
    }

    public int getSectionID(){
        return sectionID;
    }

    public String getSectionName(){
        return sectionName;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents(){
        return studentsEnrolled;
    }

    public void setSectionID(int sectionID){
        this.sectionID = sectionID;
    }

    public void setSectionName(String sectionName){
        this.sectionName = sectionName;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }

    public ArrayList<Student> setStudentsEnrolled(ArrayList<Student> studentsEnrolled){
        return studentsEnrolled;
    }

    @Override
    public String toString() {
        return "Section{" +
                "name" + sectionName + '\'' +
                "max-capacity" + maxCapacity +
                "no-of-students-enrolled" + studentsEnrolled.size() + '\'' +
                "}";
    }
}
