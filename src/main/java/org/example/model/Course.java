package org.example.model;

public class Course {
    int courseID;
    String courseName;
    String program;

    public Course(int courseID, String courseName, String program){
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;
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

    public void setCourseID(int courseID){
        this.courseID = courseID;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setProgram(String program){
        this.program = program;
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