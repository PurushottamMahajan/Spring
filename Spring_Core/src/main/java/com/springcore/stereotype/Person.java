package com.springcore.stereotype;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("person")

public class Person {
    private String name;
    private int personId;

    @Override
    public String toString() {
        return this.name + ": " + this.personId ;
    }
}

