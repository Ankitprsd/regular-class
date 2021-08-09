package com.Techment.day4.polymorphism;

class Hello
{
	public void write(int i)
	{
		System.out.println("you have written number and number is : " + i);
	}
	public void write(String msg)
	{
		System.out.println("you have written character and character is : " + msg);
	}
	public int add(int a,int b)
	{
		return a+b;
		
	}
	public int add(int a,int b, int c)
	{
		return a+b+c;
		
	}
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Hello hello =new Hello();
		hello.write("5l");
		System.out.println(hello.add(2,4,10));

	}

}
