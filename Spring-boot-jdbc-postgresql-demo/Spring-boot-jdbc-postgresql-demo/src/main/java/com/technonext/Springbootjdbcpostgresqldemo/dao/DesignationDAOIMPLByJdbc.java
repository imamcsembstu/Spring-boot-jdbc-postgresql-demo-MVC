package com.technonext.Springbootjdbcpostgresqldemo.dao;

import com.technonext.Springbootjdbcpostgresqldemo.model.Designation;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DesignationDAOIMPLByJdbc implements DesignationDAO{
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Designation> findAll() {
        return jdbcTemplate.query("SELECT * FROM Designation", new BeanPropertyRowMapper<Designation>(Designation.class));

        }
}

