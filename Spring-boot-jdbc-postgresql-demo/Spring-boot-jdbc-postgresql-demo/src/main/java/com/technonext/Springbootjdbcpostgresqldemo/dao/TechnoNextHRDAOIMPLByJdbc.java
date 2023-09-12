package com.technonext.Springbootjdbcpostgresqldemo.dao;

import com.technonext.Springbootjdbcpostgresqldemo.model.TechnoNextHR;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class TechnoNextHRDAOIMPLByJdbc implements TechnoNextHRDAO {
    private JdbcTemplate jdbcTemplate;

    public List<TechnoNextHR> findAll() {
        return jdbcTemplate.query(
                "select * from TechnoNextHR",
                (rs, rowNum) ->
                        new TechnoNextHR(
                                rs.getInt("empID"),
                                rs.getInt("empPin"),
                                rs.getString("empName"),
                                rs.getInt("empNID"),
                                rs.getString("empAddress"),
                                rs.getDate("empJoiningDate"),
                                rs.getLong("empDesignationID")
                        )

        );


    }
    public String getHello() {
        return "Hello Dao";
    }
}
