package org.example.model;

public class Student extends org.example.model.Person {
    String program;

    public Student(int ID, String name, String program){
        super(ID, name);
        this.program = program;
    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }

//    public Student(){
//
//    }
//
//    public int getStudentID() {
//        return studentID;
//    }
//
//    public String getStudentName(){
//        return studentName;
//    }
//

//
//    public void setStudentID(int studentID){
//        this.studentID = studentID;
//    }
//
//    public void setName(String studentName){
//        this.studentName = studentName;
//    }



    @Override
    public String toString() {
        return "Student{" +
                "id" + getID() + '\'' +
                "name" + getName() + '\'' +
                "program" + program +
                "}";
    }
}