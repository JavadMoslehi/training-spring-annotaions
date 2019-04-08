package com.me.spring.beanscopes;

import org.springframework.stereotype.Component;

public class MyMessage {
    private String message;

    @Override
    public String toString() {
        return "MyMessage{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
