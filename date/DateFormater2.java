package com.techment.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormater2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter longdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter shortdate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(today.format(full));
		System.out.println(today.format(longdate));
		System.out.println(today.format(medium));
		System.out.println(today.format(shortdate));
		
		LocalDateTime todaydatetime = LocalDateTime.now();
		System.out.println("today date is :"+todaydatetime);
		
		DateTimeFormatter fulltime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		System.out.println(todaydatetime.format(shortdate));
		
		ZonedDateTime date = ZonedDateTime.now();
		
		

	}

}
