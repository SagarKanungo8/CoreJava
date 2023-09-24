package com.corejava.oop;

public class Shape {
	private String color = null;
	private int borderWidth =0;
	public static final float PI = 3.14f; // class constant
	
	public Shape () {
		System.out.println("Default Cons of Shape");
	}
	public Shape(String c, int bw) {
		color = c;
		borderWidth = bw;
		System.out.println("2 Param constructor of Shape");
	}
	public int getborderWidth() {
		return borderWidth;
	}
   public void setborderWidth(int bw) {
	borderWidth = bw;	
}
   public String getcolor() {
	   return color;
   }
   public void setcolor(String color) {
	   this.color = color;
   }
  
}
