package com.technonext.Springbootjdbcpostgresqldemo.dao;

import com.technonext.Springbootjdbcpostgresqldemo.model.TechnoNextHR;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TechnoNextHRDAO {

    //Get All
    public List<TechnoNextHR> findAll();

    public String getHello();
}
