package com.technonext.Springbootjdbcpostgresqldemo.dao;

import com.technonext.Springbootjdbcpostgresqldemo.model.Designation;

import java.util.List;

public interface DesignationDAO {
    public List<Designation>findAll();
}
