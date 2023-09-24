package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c= new ArrayList<>();// Default Capacity =10
//	Collection c = new ArrayList(50);// initial capacity=50
	c.add(1);//Integer obj
	c.add(2.3);//Double obj
	c.add("Hi");//String obj
	System.out.println(c);
	System.out.println("Contains:"+c.contains(2.3));
	System.out.println("Removes:"+c.remove(1));
    //c.clear();
    System.out.println(c);
    
  //  Collection c1=new ArrayList(c);
    Collection c1=new ArrayList();
   // c1.add(c);
    c1.addAll(c);
  //  c1.remove(2.3);
   // c1.add("Java");
    System.out.println("Contains All:"+c1.containsAll(c));
  //  System.out.println(c1.removeAll(c));
    System.out.println("Retain All:"+c1.retainAll(c));
    System.out.println(c1);
	}
}
