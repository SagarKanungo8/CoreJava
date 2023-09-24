package com.corejava.oop;

public class Person {
	private String name = null;
	private int Dateofbirth;
	private String Address;
	public static int Averageage;

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setDateofbirth(int d) {
		Dateofbirth = d;
	}
	public int getDateofbirth() {
		return Dateofbirth;
	}
	public void setAddress(String address) {
		this.Address=address;
	}
	public String getAddress() {
		return Address;
	}
	public static void setAverageage (int a) {
		Averageage = a;
	}
	public int getAverageage() {
		return Averageage;
	}
}
