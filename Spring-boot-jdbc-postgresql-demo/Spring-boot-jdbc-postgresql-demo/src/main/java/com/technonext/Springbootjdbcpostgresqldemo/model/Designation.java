package com.technonext.Springbootjdbcpostgresqldemo.model;

public class Designation {



    private int empDesignationID;
    private String nameOfDesignation;

    public Designation() {
    }

    public Designation(int empDesignationID, String nameOfDesignation) {
        this.empDesignationID = empDesignationID;
        this.nameOfDesignation = nameOfDesignation;
    }

    public int getEmpDesignationID() {
        return empDesignationID;
    }

    public void setEmpDesignationID(int empDesignationID) {
        this.empDesignationID = empDesignationID;
    }

    public String getNameOfDesignation() {
        return nameOfDesignation;
    }

    public void setNameOfDesignation(String nameOfDesignation) {
        this.nameOfDesignation = nameOfDesignation;
    }

    @Override
    public String toString() {
        return "Designation{" +
                "empDesignationID=" + empDesignationID +
                ", nameOfDesignation='" + nameOfDesignation + '\'' +
                '}';
    }
}
