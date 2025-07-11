package com.selfproject.microservices.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selfproject.microservices.limits_service.bean.Limits;
import com.selfproject.microservices.limits_service.configuration.Configuration;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;
    
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(
            configuration.getMinimum(), 
            configuration.getMaximum());
    }

}
