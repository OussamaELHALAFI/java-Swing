package com.esisa.java.swing.examples;

public class Circle {

	private int x;
	private int y;
	private int ray;
	
	
	public Circle() {
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


	public int getRay() {
		return ray;
	}


	public void setRay(int ray) {
		this.ray = ray;
	}


	public Circle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}

}
