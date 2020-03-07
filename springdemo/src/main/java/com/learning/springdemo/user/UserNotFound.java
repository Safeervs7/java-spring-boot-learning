package com.learning.springdemo.user;

public class UserNotFound extends RuntimeException {
    public UserNotFound() {
    }

    public UserNotFound(String message) {
        super(message);
    }

    public UserNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
