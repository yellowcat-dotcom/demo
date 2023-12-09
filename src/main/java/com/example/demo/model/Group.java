package com.example.demo.model;

public class Group {
    private String codeDirection; //02.03.02
    private String faculty;
    private String numberGroup;

    public Group(String codeDirection, String faculty, String numberGroup) {
        this.codeDirection = codeDirection;
        this.faculty = faculty;
        this.numberGroup = numberGroup;
    }

    public String getCodeDirection() {
        return codeDirection;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getNumberGroup() {
        return numberGroup;
    }

    public void setCodeDirection(String codeDirection) {
        this.codeDirection = codeDirection;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setNumberGroup(String numberGroup) {
        this.numberGroup = numberGroup;
    }
}
