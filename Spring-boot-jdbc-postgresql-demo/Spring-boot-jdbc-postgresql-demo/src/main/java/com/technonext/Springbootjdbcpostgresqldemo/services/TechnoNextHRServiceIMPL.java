package com.technonext.Springbootjdbcpostgresqldemo.services;

import com.technonext.Springbootjdbcpostgresqldemo.dao.TechnoNextHRDAO;
import com.technonext.Springbootjdbcpostgresqldemo.model.TechnoNextHR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Service
public class TechnoNextHRServiceIMPL implements TechnoNextHRService{
    @Autowired
    private TechnoNextHRDAO technoNextHRDAO;



    @Override
    public List<TechnoNextHR> getTechnoNextHR() {
        return technoNextHRDAO.findAll();
    }


    @Override
    public String getMsg() {
        return technoNextHRDAO.getHello();
    }
}
