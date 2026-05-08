package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Department{
    private String departmentName;

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }


    @Override
    public String toString() {
        return "Department{" +
                "name" + departmentName + '\'' +
                "}";
    }
}