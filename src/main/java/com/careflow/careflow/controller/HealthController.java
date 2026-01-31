package com.careflow.careflow.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careflow.careflow.dto.HealthResponse;
import com.careflow.careflow.service.HealthService;

import org.springframework.web.bind.annotation.GetMapping;
import java.time.Instant;


@RestController
@RequestMapping("/api/health")
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService){
        this.healthService = healthService;
    }

    @GetMapping
    public HealthResponse healthStatus(){
        String status = healthService.getHealthStatus();
        Instant timeStamp = healthService.getCurrentTime();

        return new HealthResponse(
            "CareFlow API is running", 
            status, 
            timeStamp
        );
    }   
}
