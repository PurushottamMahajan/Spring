package com.springcore.stereotype;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("employee")
@Scope("prototype")
public class Employee {
	@Value("Purushottam")
	private String nameString;
	@Value("#{addressList}")
	private List<String>addressList;
	

	

	@Override
	public String toString() {
		return "Employee [nameString=" + nameString + ", addressList=" + addressList + "]";
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	

}
