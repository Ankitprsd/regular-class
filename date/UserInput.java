package com.techment.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your dob");
		String dob = sc.next();
		
		System.out.println("your dob is :"+dob);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDate birthdate = LocalDate.parse(dob, dtf1);
		System.out.println("Birthdate :"+birthdate);

	}

}
