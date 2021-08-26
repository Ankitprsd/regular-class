package com.techment.modal;

public class Employee {
	
	int id;
	String name;
	int salary;
	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	/**
	 * @param id
	 */
	public Employee(int id) {
		super();
		this.id = id;
	}

	


	/**
	 * 
	 */
	public Employee() {
		super();
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

}
