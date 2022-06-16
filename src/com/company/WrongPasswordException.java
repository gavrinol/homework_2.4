package com.company;

public class WrongPasswordException extends Throwable {

    public WrongPasswordException(String message) {
        super(message);
    }
}
