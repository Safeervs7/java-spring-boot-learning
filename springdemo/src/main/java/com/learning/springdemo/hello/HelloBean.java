package com.learning.springdemo.hello;

public class HelloBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public HelloBean(String message)
    {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

