package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBean1 {

	public MyBean1()
	{
		System.out.println("Constructore autowiring");
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