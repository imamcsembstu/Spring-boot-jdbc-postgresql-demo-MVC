package com.technonext.Springbootjdbcpostgresqldemo.model;

import java.util.Date;

public class Attendance {
    private long attendanceID;
    private Date attendanceDate;
    private boolean isPresent;

    private long empID;

    public Attendance() {
    }

    public Attendance(long attendanceID, Date attendanceDate, boolean isPresent, long empID) {
        this.attendanceID = attendanceID;
        this.attendanceDate = attendanceDate;
        this.isPresent = isPresent;
        this.empID = empID;
    }

    public long getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(long attendanceID) {
        this.attendanceID = attendanceID;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public long getEmpID() {
        return empID;
    }

    public void setEmpID(long empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceID=" + attendanceID +
                ", attendanceDate=" + attendanceDate +
                ", isPresent=" + isPresent +
                ", empID=" + empID +
                '}';
    }
}
