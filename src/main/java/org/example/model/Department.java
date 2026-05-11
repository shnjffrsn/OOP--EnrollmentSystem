package org.example.model;

import java.util.*;

public class Department{
    private String departmentName;
    private ArrayList<Section> sections;

    public Department(String departmentName){
        this.departmentName = departmentName;
        this.sections = new ArrayList<>();
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public ArrayList<Section> getSections(){
        return sections;
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