package com.example.demo.model;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private String fatherName;
    private Group numberGroup;
    private boolean isElder;


    public Student(int id, String firstName, String secondName, String fatherName, Group numberGroup, boolean isElder) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.numberGroup = numberGroup;
        this.isElder = isElder;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Group getNumberGroup() {
        return numberGroup;
    }
    public boolean isElder() {
        return isElder;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setNumberGroup(Group numberGroup) {
        this.numberGroup = numberGroup;
    }

    public void setElder(boolean elder) {
        isElder = elder;
    }

}
