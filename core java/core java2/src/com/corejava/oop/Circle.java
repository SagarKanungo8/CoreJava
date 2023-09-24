package com.corejava.oop;

public class Circle extends Shape{
public Circle() {
	super();
	System.out.println("Default cons of Circle");
}
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
public Circle(int r) {
	this.radius = radius;
	System.out.println("1 param cons of Circle");
	
	
	
		
}


}

