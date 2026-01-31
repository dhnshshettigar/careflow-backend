package com.careflow.careflow.service;
import java.time.Instant;
import org.springframework.stereotype.Service;
@Service
public class HealthService {
    
    public String getHealthStatus() {
        return "UP";
    }

    public Instant getCurrentTime(){
        return Instant.now();
    }
}
