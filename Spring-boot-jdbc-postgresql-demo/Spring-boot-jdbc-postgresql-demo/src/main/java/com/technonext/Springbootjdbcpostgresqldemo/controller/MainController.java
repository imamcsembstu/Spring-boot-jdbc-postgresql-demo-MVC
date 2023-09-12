package com.technonext.Springbootjdbcpostgresqldemo.controller;

import com.technonext.Springbootjdbcpostgresqldemo.model.Designation;
import com.technonext.Springbootjdbcpostgresqldemo.model.TechnoNextHR;
import com.technonext.Springbootjdbcpostgresqldemo.services.DesignationService;
import com.technonext.Springbootjdbcpostgresqldemo.services.TechnoNextHRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private TechnoNextHRService technoNextHRService;

    @GetMapping("/technonexthr")
    public List<TechnoNextHR>getTechnoNextHR(){

        return  this.technoNextHRService.getTechnoNextHR();
    }


    @Autowired
    private DesignationService designationService;
    @GetMapping("/designation")
    public List<Designation>getDesignation(){

        return  this.designationService.getDesignation();
    }




}
