package com.Techment.day6.exception;

import java.io.FileNotFoundException;

public class CheckedAndUnchecked {

	public static void main(String[] args) { //throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//throw new ArithmeticException("some thing went wrong");
		try
	{
			
	    throw new FileNotFoundException("file not found");
		
	}
	catch(FileNotFoundException e)
	{
		System.out.println("something went wrong");
		
	}
	}
}
