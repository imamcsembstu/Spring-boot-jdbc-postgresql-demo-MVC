package com.technonext.Springbootjdbcpostgresqldemo.services;

import com.technonext.Springbootjdbcpostgresqldemo.model.TechnoNextHR;

import java.util.List;

public interface TechnoNextHRService {
    public List<TechnoNextHR> getTechnoNextHR();

    public String getMsg();
}
