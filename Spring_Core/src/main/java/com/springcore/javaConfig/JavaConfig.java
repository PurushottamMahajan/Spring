package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean(name={"Pustak","Kitab"})
	public Books getBooks()
	{
		return new Books();
	}
	
	
	@Bean("student")
	public Student getStudent()
	{
		Student student= new Student(getBooks());
		return student;
	}
}
