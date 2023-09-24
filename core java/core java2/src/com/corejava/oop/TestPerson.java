package com.corejava.oop;

public class TestPerson {

	public static void main(String[] args) {
		Person p;
		p=new Person();
		p.setName("sagar kanungo");
		p.setDateofbirth(8);
		p.setAddress("laxminarayan colony mandleshwar");
		p.setAverageage(29);
		System.out.println("Name:"+p.getName());
		System.out.println("Dateofbirth:"+p.getDateofbirth());
		System.out.println("Address:"+p.getAddress());
		System.out.println("Averageage:"+p.getAverageage());
		// TODO Auto-generated method stub

	}

}
