package com.techment.date;

import java.time.LocalDate;

public class Dateparsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dob ="30/11/1989";
		String joiningDate="2020/02/22";
		System.out.println("date of birth :"+dob);
		System.out.println("date of joining :"+joiningDate);
		
		LocalDate joiningAateAfterParsing = LocalDate.parse(joiningDate);
		System.out.println(joiningAateAfterParsing);
		
		System.out.println(joiningAateAfterParsing.getYear());
		System.out.println(joiningAateAfterParsing.getMonth());
		
		System.out.println("=======================sample=======================");
		LocalDate today = LocalDate.now();
		LocalDate joiningdate = LocalDate.parse(joiningDate); 
		LocalDate birthdate = LocalDate.of(1998, 9, 24);
		

	}

}
