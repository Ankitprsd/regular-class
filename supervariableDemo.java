package com.Techment.day4.oops;

class Parent
{
	int a=20;
}
class Child extends Parent
{
	
	int a=10;
	
	void sum()
	{
		int a=5;
		
		int c=a+a;
		System.out.println("Sum :" +c);
		 
		int d=this.a+a;
		System.out.println("Sum :" +d);
		
		int e=super.a+a;
		System.out.println("Sum :" +e);
		
		int f=super.a+this.a+a;
		System.out.println("Sum :" +f);
	}
}

public class supervariableDemo {

	public static void main(String[] args) {
		Child child =new Child();
		child.sum();

	}

}
