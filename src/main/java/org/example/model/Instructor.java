package org.example.model;

public abstract class Instructor extends Person{
    private String courses;

    public Instructor(String courses){
        super();
        this.courses = courses;
    }

    void instructor(){
        System.out.println(courses);
    }
        @Override
        public String toString() {
            return "Instructor{" +
                    "name" + getName() + '\'' +
                    "courses" + courses +
                    "}";    }
}