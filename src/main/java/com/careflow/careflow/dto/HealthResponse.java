package com.careflow.careflow.dto;

import java.time.Instant;

public class HealthResponse {
    private String message;
    private String  status;
    private Instant timeStamp;

    public HealthResponse(String message, String status,Instant timeStamp){
        this.message = message;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public String getStatus(){ return status; }
    public String getMessage(){ return message; }
    public Instant getTimeStamp(){ return timeStamp; }

    
}
