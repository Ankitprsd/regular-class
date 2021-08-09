package com.Techment.day6.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		try
		{
			System.out.println("Enter the first number");
			int n=sc.nextInt();
			System.out.println("Enter the first number");
			int m= sc.nextInt();
			int c=n/m;
			System.out.println(c);
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("Do not give zero");
		}
		catch (InputMismatchException e)
		{
			System.out.println("do not give charater only number");
		}
		


	}

}
