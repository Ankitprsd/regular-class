package com.Techment.day6.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1 = new ArrayList<Integer>(); //can store any type of object
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("Elements of a1 are : " + a1);
		
		Iterator<Integer> itr =a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
