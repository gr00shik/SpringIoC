package com.gr00shik.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Class3 {

    @Value("MESSAGE")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Class3{" +
                "message='" + message + '\'' +
                '}';
    }
}
