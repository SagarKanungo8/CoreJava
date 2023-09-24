package com.corejava.oop;

public class Automobile {
	private String Color = null;
	private int Speed;
	private String Make;
	public static int Numberofgears;
	
	public void setColor(String Color) {
		this.Color=Color;
	}
	public String getColor() {
		return Color;
	}
	public void setSpeed(int s) {
		Speed = s;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setMake(String Make) {
		this.Make=Make;
	}
	public String getMake() {
		return Make;
	}
	public void setNumberofgears(int n) {
		Numberofgears=n;
	}
	public int getNumberofgears() {
		return Numberofgears;
	}

}
