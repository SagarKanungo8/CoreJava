package com.rays.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
public static void main(String[] args) {
	LinkedList l = new LinkedList();
	for(int i=0;i<10;i++) {
		l.add(i);
	}
//   Iterator di=l.descendingIterator();
	Iterator di=l.iterator();
	while(di.hasNext()) {
		System.out.println(di.next());
	}
}
}
