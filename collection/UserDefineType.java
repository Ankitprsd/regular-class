package com.Techment.day6.collection;

import java.util.ArrayList;

class Employee
{
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
}
public class UserDefineType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(1,"Ankit","Software developer");
		Employee emp2 = new Employee(2,"Rahul","Hr");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee(3,"akhil","Software tester"));
		for(Employee emp:employees)
		{
			System.out.println(emp.id+" "+emp.name+" "+emp.dept);
			
		}
		
	}

}
