package org.example.model;

public abstract class Student extends Person{
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

    @Override
    void mainTask(){
        System.out.println("Student learns");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id" + getID() + '\'' +
                "name" + getName() + '\'' +
                "program" + program +
                "}";
    }
}