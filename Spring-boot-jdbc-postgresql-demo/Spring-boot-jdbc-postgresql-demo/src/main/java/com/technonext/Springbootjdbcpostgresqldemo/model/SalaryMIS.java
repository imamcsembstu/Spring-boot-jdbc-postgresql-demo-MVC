package com.technonext.Springbootjdbcpostgresqldemo.model;

import java.time.Month;

public class SalaryMIS {
    private int salaryMISID;
    private Month monthOfSalary;
    private int netSalary;
    private long empID;


    public SalaryMIS() {
    }

    public SalaryMIS(int salaryMISID, Month monthOfSalary, int netSalary, long empID) {
        this.salaryMISID = salaryMISID;
        this.monthOfSalary = monthOfSalary;
        this.netSalary = netSalary;
        this.empID = empID;
    }

    public int getSalaryMISID() {
        return salaryMISID;
    }

    public void setSalaryMISID(int salaryMISID) {
        this.salaryMISID = salaryMISID;
    }

    public Month getMonthOfSalary() {
        return monthOfSalary;
    }

    public void setMonthOfSalary(Month monthOfSalary) {
        this.monthOfSalary = monthOfSalary;
    }

    public int getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(int netSalary) {
        this.netSalary = netSalary;
    }

    public long getEmpID() {
        return empID;
    }

    public void setEmpID(long empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "SalaryMIS{" +
                "salaryMISID=" + salaryMISID +
                ", monthOfSalary=" + monthOfSalary +
                ", netSalary=" + netSalary +
                ", empID=" + empID +
                '}';
    }
}
