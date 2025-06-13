package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context=  new ClassPathXmlApplicationContext("com\\springcore\\collections\\colconfig.xml");
		  Employee employee = (Employee) context.getBean("Emp1");
		  
		  //System.out.println(employee);
		  System.out.println(employee.getNameString());
		  System.out.println(employee.getAddress());
		  System.out.println(employee.getCoursesMap());
		  Employee employee2 = (Employee) context.getBean("Emp2");
		  
		  //System.out.println(employee);
		  System.out.println(employee2.getNameString());
		  System.out.println(employee2.getAddress());
		  System.out.println(employee2.getCoursesMap());	  
		  
		  
		  
		  
		
	}

}
