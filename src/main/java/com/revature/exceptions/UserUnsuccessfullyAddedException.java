package com.revature.exceptions;

public class UserUnsuccessfullyAddedException extends RuntimeException {

    public UserUnsuccessfullyAddedException(String message) {
        super(message); // invoke the parent class constructor and pass in the message to the parent
    }

}