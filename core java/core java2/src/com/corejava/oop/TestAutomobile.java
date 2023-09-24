package com.corejava.oop;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile a;
		a=new Automobile();
		a.setColor("White");
		a.setSpeed(187);
		a.setMake("TVSApacheRTR");
		a.setNumberofgears(5);
		System.out.println("Color:"+a.getColor());
		System.out.println("Speed:"+a.getSpeed());
		System.out.println("Make:"+a.getMake());
		System.out.println("Numberofgears:"+a.getNumberofgears());
		// TODO Auto-generated method stub

	}

}
