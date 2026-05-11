package org.example.model;

public class Course {
    int courseID;
    String courseName;
    String program;
    int units;

    public Course(int courseID, String courseName, String program, int units){
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;
        this.units = units;
    }

    public int getCourseID(){
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProgram(){
        return program;
    }

    public int getUnits(){
        return units;
    }

    public void setCourseID(int courseID){
        this.courseID = courseID;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id" + courseID + '\'' +
                "name" + courseName + '\'' +
                "program" + program +
                "}";
    }
}