package com.example.aoe2reactdata.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.aoe2reactdata.model.Civilizations;
import com.example.aoe2reactdata.service.CivilizationsImplService;
@RestController
@RequestMapping(value= "/api/civs/")
@CrossOrigin(origins = "http://localhost:3000")         // for individual controller, allowed all request from localhost:4200

public class Aoe2ReactDataController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    CivilizationsImplService serv;
    @GetMapping(value= "/")
	    public Collection<Civilizations> getAll() {
	        logger.debug("Getting all civilizations.");
	        return serv.getAllCivilizations();
	    }
    @PutMapping(value = "/")
    public Civilizations update(@RequestBody Civilizations emp) {
    	return serv.update(emp);
    }
    
}
