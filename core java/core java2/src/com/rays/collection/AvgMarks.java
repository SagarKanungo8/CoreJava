package com.rays.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class AvgMarks {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(100);
		al.add(120);
		al.add(130);
		al.add(140);
		al.add(120);
		al.add(130);
		al.add(150);
		al.add(190);
		int total=0;
		int avg;
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			total = (int) al.get(i);
			avg = total / al.size();
			System.out.println("The Avg is:"+ avg);
			
			
			
	}
	

}

}
