package com.example.demo.exception;
import java.util.Date;

public class ErrorDetails {
    //properties
    private Date timestamp;
    private String message;
    private String details;
//constructor
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    //getTimestamp
    public Date getTimestamp() {
        return timestamp;
    }

    //getMessage
    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}