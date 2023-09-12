package com.technonext.Springbootjdbcpostgresqldemo.model;

import java.util.Date;

public class Holiday {
    private int holidayID;
    private String holidayTitle;
    private Date holidayDate;

    public Holiday() {
    }

    public Holiday(int holidayID, String holidayTitle, Date holidayDate) {
        this.holidayID = holidayID;
        this.holidayTitle = holidayTitle;
        this.holidayDate = holidayDate;
    }

    public int getHolidayID() {
        return holidayID;
    }

    public void setHolidayID(int holidayID) {
        this.holidayID = holidayID;
    }

    public String getHolidayTitle() {
        return holidayTitle;
    }

    public void setHolidayTitle(String holidayTitle) {
        this.holidayTitle = holidayTitle;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "holidayID=" + holidayID +
                ", holidayTitle='" + holidayTitle + '\'' +
                ", holidayDate=" + holidayDate +
                '}';
    }
}
