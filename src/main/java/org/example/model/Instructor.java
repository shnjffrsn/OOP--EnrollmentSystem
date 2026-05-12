package org.example.model;

public class Instructor extends Person {
    String courses;

    public Instructor(int ID, String name, String courses){
        super(ID, name);
        this.courses = courses;
    }

    public String getCourses(){
        return courses;
    }

    public void setCourses(String courses){
        this.courses = courses;
    }

        @Override
        public String toString() {
            return "Instructor{" +
                    "name" + getName() + '\'' +
                    "courses" + courses +
                    "}";    }
}