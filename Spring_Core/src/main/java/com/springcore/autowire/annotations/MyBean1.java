package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyBean1 {
    private final MyBean2 dependency; // Assume MyBean2 is another bean

    @Autowired
    public MyBean1(@Qualifier("myBean2") MyBean2 dependency) {
        this.dependency = dependency;
        System.out.println("Constructor autowiring with dependency: " + dependency);
    }
    public void customInit() {
        System.out.println("\n\nInside custom init method");
    }

    public void customDestroy() {
        System.out.println("\n\nInside custom destroy method");
    }
    @Override
    public String toString() {
        return "BeanWithXmlConfig{}";
    }
}