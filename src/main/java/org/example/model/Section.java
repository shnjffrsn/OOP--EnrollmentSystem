package org.example.model;

public class Section {
    String sectionName;
    int maxCapacity;

    public Section(String sectionName, int maxCapacity) {
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
    }

    public String getSectionName(){
        return sectionName;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    public void setSectionName(String sectionName){
        this.sectionName = sectionName;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Section{" +
                "name" + sectionName + '\'' +
                "max-capacity" + maxCapacity +
                "}";
    }
}
