package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11+25}")
	private int x;
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	@Value("#{78>8}")
	private boolean isActive;
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	public double getPi() {
		return pi;
	}
	@Value("#{new java.lang.String('Purushottam')}")
	private String nameString;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

}
