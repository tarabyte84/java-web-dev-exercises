package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject = null;
    private int yearsTeaching = 0;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

//    public Teacher(String firstName, String lastName) {
//     this(firstName, lastName, subject, yearsTeaching);
//    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String newFirstName) {
        firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String newSubject) {
        subject = newSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int newYearsTeaching) {
        yearsTeaching = newYearsTeaching;
    }
}
