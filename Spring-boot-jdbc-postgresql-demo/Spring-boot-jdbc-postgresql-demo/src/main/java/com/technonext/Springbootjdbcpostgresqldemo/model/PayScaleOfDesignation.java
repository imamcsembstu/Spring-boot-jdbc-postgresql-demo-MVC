package com.technonext.Springbootjdbcpostgresqldemo.model;

public class PayScaleOfDesignation {
    private long paysScaleID;
    private int salary;
    private long empDesignationID;


    public PayScaleOfDesignation() {
    }

    public PayScaleOfDesignation(long paysScaleID, int salary, long empDesignationID) {
        this.paysScaleID = paysScaleID;
        this.salary = salary;
        this.empDesignationID = empDesignationID;
    }

    public long getPaysScaleID() {
        return paysScaleID;
    }

    public void setPaysScaleID(long paysScaleID) {
        this.paysScaleID = paysScaleID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getEmpDesignationID() {
        return empDesignationID;
    }

    public void setEmpDesignationID(long empDesignationID) {
        this.empDesignationID = empDesignationID;
    }

    @Override
    public String toString() {
        return "PayScaleOfDesignation{" +
                "paysScaleID=" + paysScaleID +
                ", salary=" + salary +
                ", empDesignationID=" + empDesignationID +
                '}';
    }
}
