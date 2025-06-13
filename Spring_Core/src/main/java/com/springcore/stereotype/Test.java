package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//Includes the demonstration of STEREOTYPE ANNOTATIONS & BEAN SCOPE (SINGLTON AND PROTOTYPE)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context=  new ClassPathXmlApplicationContext("com\\springcore\\stereotype\\stereoconfig.xml");
		  Employee employee = context.getBean("employee",Employee.class);
		  
		  //System.out.println(employee);
		  System.out.println(employee.hashCode());  
		  Person person = context.getBean("person",Person.class);
		  
		  //System.out.println(employee);
		  System.out.println(person.hashCode());
		  Person person2 = context.getBean("person",Person.class);
		  
		  //System.out.println(employee);
		  System.out.println(person2.hashCode());
	}

}
