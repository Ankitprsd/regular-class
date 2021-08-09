package com.Techment.day6.exception;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nami is ankit");
		System.out.println("email ankit.kumar");
		int arr[] = new int[5];
		try
		{
			System.out.println(1/1);
			arr[7]=24;
			
		}
	//	catch(ArithmeticException e)
		catch (ArithmeticException e)
		{
			System.out.println("Dont give zero");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size is 5 give from 0 to 4");
		}
		catch (Exception e)
		{
			System.out.println("something went wrong");
		}

		System.out.println("contact 9431926024");
		

	}

}
