package com.springcore.lifecycle;

public class MyBean1 {
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