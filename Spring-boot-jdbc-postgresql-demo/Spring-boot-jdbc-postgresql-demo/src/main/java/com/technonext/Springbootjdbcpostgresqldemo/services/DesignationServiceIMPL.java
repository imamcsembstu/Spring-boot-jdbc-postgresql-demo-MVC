package com.technonext.Springbootjdbcpostgresqldemo.services;

import com.technonext.Springbootjdbcpostgresqldemo.dao.DesignationDAO;
import com.technonext.Springbootjdbcpostgresqldemo.model.Designation;
import com.technonext.Springbootjdbcpostgresqldemo.model.TechnoNextHR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DesignationServiceIMPL implements DesignationService{

    private DesignationDAO designationDAO;

    @Override
    public List<Designation> getDesignation() {
        return this.designationDAO.findAll();
    }
}

