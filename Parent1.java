package com.Techment.day4.oops;

class Parent2
{
	int a;
	
	Parent2(int a)
	{
		System.out.println("this is parent constructor"+ a);
		
	}
}
class Child1 extends Parent2
{
	Child1()
	{
		super(2);
		System.out.println("this is child constructor");
		
	}
}

public class Parent1 {

	public static void main(String[] args) {
		Child1 child1=new Child1();

	}

}
