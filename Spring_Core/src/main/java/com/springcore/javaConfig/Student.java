package com.springcore.javaConfig;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
@Component
public class Student {
	private Books books;
	
	public Student(Books b) {
		this.books=b;
		
	}
	public void Task()
	{
		System.out.println("Student is reading book");
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
}
