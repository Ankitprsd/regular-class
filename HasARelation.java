package com.Techment.day5.oops;

class Employee
{
	int id;
	String name;
	Address address; //object reference(has-a relation)
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployeeInfo()
	{
		System.out.println("id :"+ id);
		System.out.println("name :"+ name);
		System.out.println("door no :"+ address.doorNo);
		System.out.println("streetname :"+ address.StreetName);
		System.out.println("city :"+ address.city);
		System.out.println("pincode :"+ address.pinCode);
	}
	
}

class Address
{
	int doorNo;
	String StreetName;
	String city;
	int pinCode;
	
	public Address(int doorNo, String streetName, String city, int pinCode) {
		super();
		this.doorNo = doorNo;
		this.StreetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	
}

public class HasARelation {

	public static void main(String[] args) {
		
		Address address = new Address(101,"BTM","Bangalore",562284);
		
		Employee e = new Employee(101,"safan",address);
		e.displayEmployeeInfo();

	}

}
