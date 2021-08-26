package com.Techment.day8.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m = new HashMap();
		m.put("2409", "Ankit Kumar");
		m.put("0103", "Raj");
		
		System.out.println("HashMap contains : " + m);
		

		
		for(Entry<String , String> s : m.entrySet())
		{
			System.out.println(s);
		}
			
	}

}
