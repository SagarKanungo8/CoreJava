package com.corejava.oop;

public class TestShape {

	public static void main(String[] args) {
		Shape s;
		s=new Shape();
		s.setborderWidth(3);
		s.setcolor("Red");
		System.out.println("borderWidth:"+s.getborderWidth());
		System.out.println("Color:"+s.getcolor());
    	System.out.println(s.PI);
	    System.out.println("---------------------------------");
        Shape s1 = new Shape();
        s1.setcolor("White");
        s1.setborderWidth(3);
        System.out.println(s1.PI);
        System.out.println("------------------------------------");
        System.out.println(Shape.PI);
	}

}
