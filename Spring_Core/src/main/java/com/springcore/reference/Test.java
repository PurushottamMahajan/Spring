package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context= new ClassPathXmlApplicationContext("com\\springcore\\reference\\refconfig.xml");
         
         A a = (A) context.getBean("Aref");
         //B b = (B) context.getBean("Bref");
         
         System.out.println(a.getX());
         System.out.println(a.getOb().getY());
         System.out.println(a);
         
         B b = (B) context.getBean("Bref");
         
         System.out.println(b.getY());
     
         System.out.println(b);
         
	}

}
