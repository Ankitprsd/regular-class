package com.Techment.day8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(6);
		hs.add(11);
		hs.add(7);
		hs.add(26);
		hs.add(6);
		
		System.out.println("hashset"+hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(1);
		lhs.add(6);
		lhs.add(11);
		lhs.add(7);
		lhs.add(26);
		lhs.add(6);
		
		System.out.println("hashset"+lhs);

	}

}
