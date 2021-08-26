package com.techment.modal;

public class Employee {
	
	private String id;  
	private String name;  
	private Address address;  
	  
	

	
	/**
	 * @param id
	 * @param name
	 * @param address
	 */
	public Employee(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}




	public void displayInfo(){  
	    System.out.println(id+" "+name+" "+address);  
	    address.displayInformation();
	   
	}  


}
