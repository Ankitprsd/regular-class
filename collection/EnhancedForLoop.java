package com.Techment.day6.collection;

import java.util.ArrayList;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1 = new ArrayList<Integer>(); //can store any type of object
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("Elements of a1 are : " + a1);
		
		for(int a:a1)
		{
			System.out.println(a);
		}
		
		
	}

}
