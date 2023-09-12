package com.technonext.Springbootjdbcpostgresqldemo.model;

public class Weekend {

    private long weekendID;
    private String weekDays;
    private int daysID;
    private boolean isWeekend;

    public Weekend() {
    }

    public Weekend(long weekendID, String weekDays, int daysID, boolean isWeekend) {
        this.weekendID = weekendID;
        this.weekDays = weekDays;
        this.daysID = daysID;
        this.isWeekend = isWeekend;
    }

    public long getWeekendID() {
        return weekendID;
    }

    public void setWeekendID(long weekendID) {
        this.weekendID = weekendID;
    }

    public String getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(String weekDays) {
        this.weekDays = weekDays;
    }

    public int getDaysID() {
        return daysID;
    }

    public void setDaysID(int daysID) {
        this.daysID = daysID;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    @Override
    public String toString() {
        return "Weekend{" +
                "weekendID=" + weekendID +
                ", weekDays='" + weekDays + '\'' +
                ", daysID=" + daysID +
                ", isWeekend=" + isWeekend +
                '}';
    }
}
