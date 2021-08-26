package com.techment.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a;
	     int b;
	     float c;
	     Scanner scanner = new Scanner(System.in);
    	 System.out.println("Enter numerator:");
	     a = scanner.nextInt();
	     System.out.println("Enter denominator:");
	     b = scanner.nextInt();
	     try 
			{ 
                 c=a/b;
		     System.out.println(c0);
			}  
			
	     catch (ArithmeticException e)
	     {
	    	 System.out.println("Division with 0 is not possible");
	     }

	     catch (InputMismatchException e)  
			{ 
				System.out.println("Only Integers are allowed"); 
			} 
	     catch (NullPointerException e)
	     {
	    	 System.out.println("No input received");
	     }

	}

}
