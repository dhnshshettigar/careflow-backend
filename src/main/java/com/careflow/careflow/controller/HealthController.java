package com.careflow.careflow.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careflow.careflow.service.HealthService;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/health")
public class HealthController {

    // @GetMapping("/details")
    // public String getDetails() {
    //     return "Details page";
    // }

    private final HealthService healthService;

    public HealthController(HealthService healthService){
        this.healthService = healthService;
    }

    @GetMapping
    public String healthStatus(){
        return healthService.getHealthStatus();
    }
    
}
