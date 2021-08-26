package com.Techment.day6.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>(); //can store any type of object
		a1.add("sachin");
		a1.add("ravi");
		a1.add("kumar");
		a1.add("sowmya");
		System.out.println("Elements of a1 are : " + a1);
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("sourab");
		a2.add("manish");
		a2.add("sachin");
		a2.add("ankit");
		a2.add("kumar");
		System.out.println("Elements of a2 are : " + a2);
		
		a2.addAll(a1);
		System.out.println("Elements after merging a1 & a2 : " + a2);
		
		a2.remove(2);
		a2.remove(3);
		System.out.println("Elements after deleting duplicate a1 & a2 : " + a2);
		
		Collections.sort(a2);
		System.out.println("Elements of a2 after sorting: " + a2);
	}

}
