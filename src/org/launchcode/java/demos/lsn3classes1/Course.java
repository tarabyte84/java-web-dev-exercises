package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

//    -String teacher
//    -int credits
//    -ArrayList roster
//
//    rosterData()
//        - an array list of student objects
//          - each student is a hashmap

    private String teacher;
    private int credits;
    private ArrayList<String> roster;

    public Course(String teacher, int credits, ArrayList<String> roster) {
        this.teacher = teacher;
        this.credits = credits;
        this.roster = roster;
    }

    public String getTeacher() {
        return teacher;
    }

//    public void setTeacher(String newTeacher) {
//
//    }
}
