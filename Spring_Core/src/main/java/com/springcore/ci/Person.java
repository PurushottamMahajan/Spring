package com.springcore.ci;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certi certi;
    private List <String>list;
    public Person(String name, int personId, Certi c,List<String>list) {
        this.name = name;
        this.personId = personId;
        this.certi = c;
        this.list = list;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.personId + "{ " + this.certi.nameString + " } List : "+this.list;
    }
}

