package com.springcore.reference;

public class A {

	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	private int x;
	private B ob;
}
