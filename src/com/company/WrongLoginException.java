package com.company;

public class WrongLoginException extends Throwable {
    public WrongLoginException(String message) {
        super(message);
    }
}