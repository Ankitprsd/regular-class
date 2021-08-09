package com.Techment.abstraction;

class Employee
{
	static String dept;
	final int id=1;
}

public class StaticFinalDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.dept="hr";
		emp2.dept="developer";
		
		System.out.println("emp1 "+emp1.dept);
		System.out.println("emp2 "+emp2.dept);

	}

}
