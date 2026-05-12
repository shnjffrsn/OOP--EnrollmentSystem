package org.example.model;

import java.util.*;

public class Department{
    private int departmentID;
    private String departmentName;
    private ArrayList<Section> sections;

    public Department(String departmentName){
        this.departmentID = 0;
        this.departmentName = departmentName;
        this.sections = new ArrayList<>();
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public ArrayList<Section> getSections(){
        return sections;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public void setSection(Section section) {
        sections.add(section);
    }


    @Override
    public String toString() {
        return "Department{" +
                "name" + departmentName + '\'' +
                "}";
    }
}