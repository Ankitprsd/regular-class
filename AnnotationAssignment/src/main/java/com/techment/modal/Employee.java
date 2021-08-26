package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //<bean id="employee" class="com.techment.modal.Employee".
public class Employee {
	
//	int id;
//	String name;
	@Autowired
	Address address;
	
	
	public void displayEmployeeInfo()
	{
//		System.out.println();
		address.AddressDetails();
	}

}
