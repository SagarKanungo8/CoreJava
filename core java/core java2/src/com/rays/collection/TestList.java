package com.rays.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestList {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(0,"Zero");
	for(int i=0;i<10;i++) {
		al.add(i,i);
	}		System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.get(8));
	System.out.println(al.remove(3));
	al.add(0,"Zero");
	System.out.println("Index of:"+al.indexOf("Zero"));
	System.out.println("last Index Of:"+al.lastIndexOf("Zero"));
	System.out.println("Sub list:"+al.subList(4,8));
	System.out.println(al);
	System.out.println(al.set(2, "Two"));
	System.out.println(al);
	//ListIterator li = al.listIterator();
	ListIterator li = al.listIterator(5);
//	while (li.hasNext()) {
	//	System.out.println(li.nextIndex() + "\t" + li.next());
	while (li.hasNext()) {
		System.out.println(li.previousIndex() + "\t" + li.previous());
	}

}
}
