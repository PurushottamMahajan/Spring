package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//Demonstrate Spring Expression language.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com\\springcore\\SpEL\\SpElconfig.xml");
		
		Demo person = (Demo) context.getBean("demo");
		System.out.println(person);
		System.out.println(person.getZ());
		System.out.println(person.getPi());
		System.out.println(person.getNameString());
		System.out.println(person.isActive());
	}

}
