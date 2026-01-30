package com.careflow.careflow.service;

import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HealthService {
    
    public String getHealthStatus() {
        return "CareFlow API is running and we are using service!";
    }
}
