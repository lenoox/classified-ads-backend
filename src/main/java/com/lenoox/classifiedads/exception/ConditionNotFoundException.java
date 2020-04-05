package com.lenoox.classifiedads.exception;


public class ConditionNotFoundException extends RuntimeException {

    public ConditionNotFoundException(String name){
        super("Condition " + name + " not found");
    }

}