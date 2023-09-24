package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
	Collection c = new ArrayList();
	for(int i=1; i<=10; i++) {
	c.add("Hello"+i);
	}
System.out.println(c);
// Shape s=new Circle();
//Circle c=(Circle)s;
for(Object t:c) {
	String str = (String)t;
	System.out.println(str.toUpperCase());
}
Iterator i = c.iterator();
//c.add(3);
while(i.hasNext()) {
	//c.remove("Helllo1");
	String s=(String) i.next();
	System.out.println(s.toLowerCase());
	i.remove();
}
System.out.println(c);
}
}

