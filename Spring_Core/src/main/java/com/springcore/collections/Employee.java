package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String nameString;
	private List<String>phone;
	private Set<String>address;
	private Map<String, String>coursesMap;
	@Override
	public String toString() {
		return "Employee [nameString=" + nameString + ", phone=" + phone + ", address=" + address + ", coursesMap="
				+ coursesMap + ", getNameString()=" + getNameString() + ", getPhone()=" + getPhone() + ", getAddress()="
				+ getAddress() + ", getCoursesMap()=" + getCoursesMap() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String nameString, List<String> phone, Set<String> address, Map<String, String> coursesMap) {
		super();
		this.nameString = nameString;
		this.phone = phone;
		this.address = address;
		this.coursesMap = coursesMap;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCoursesMap() {
		return coursesMap;
	}
	public void setCoursesMap(Map<String, String> coursesMap) {
		this.coursesMap = coursesMap;
	}

}
