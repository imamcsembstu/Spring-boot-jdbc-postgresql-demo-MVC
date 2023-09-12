package com.technonext.Springbootjdbcpostgresqldemo.model;

import java.math.BigDecimal;
import java.util.Date;

public class TechnoNextHR {
    private int empID;
    private int empPin;
    private String empName;
    private int empNID;
    private String empAddress;
    private java.sql.Date empJoiningDate;
    private long empDesignationID;


    public TechnoNextHR(int empID, String emmName, BigDecimal price) {
    }

    public TechnoNextHR(int empID, int empPin, String empName, int empNID, String empAddress, java.sql.Date empJoiningDate, long empDesignationID) {
        this.empID = empID;
        this.empPin = empPin;
        this.empName = empName;
        this.empNID = empNID;
        this.empAddress = empAddress;
        this.empJoiningDate = empJoiningDate;
        this.empDesignationID = empDesignationID;
    }

    public TechnoNextHR(int empID, int empPin, String empName, int empNID, String empAddress, Date empJoiningDate, long empDesignationID) {
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpPin() {
        return empPin;
    }

    public void setEmpPin(int empPin) {
        this.empPin = empPin;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpNID() {
        return empNID;
    }

    public void setEmpNID(int empNID) {
        this.empNID = empNID;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Date getEmpJoiningDate() {
        return empJoiningDate;
    }

    public void setEmpJoiningDate(java.sql.Date empJoiningDate) {
        this.empJoiningDate = empJoiningDate;
    }

    public long getEmpDesignationID() {
        return empDesignationID;
    }

    public void setEmpDesignationID(long empDesignationID) {
        this.empDesignationID = empDesignationID;
    }

    @Override
    public String toString() {
        return "TechnoNextHR{" +
                "empID=" + empID +
                ", empPin=" + empPin +
                ", empName='" + empName + '\'' +
                ", empNID=" + empNID +
                ", empAddress='" + empAddress + '\'' +
                ", empJoiningDate=" + empJoiningDate +
                ", empDesignationID=" + empDesignationID +
                '}';
    }
}
