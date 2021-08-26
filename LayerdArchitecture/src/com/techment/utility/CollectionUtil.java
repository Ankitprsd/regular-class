package com.techment.utility;

import java.util.HashMap;
import java.util.Map;

import com.techment.modal.Employee;

public class CollectionUtil {

	static Map<Integer , Employee> employees = new HashMap<Integer , Employee>();
	
	static
	{
		employees.put(1,new Employee(1,"john","hr",34000));
		employees.put(2,new Employee(2,"kabir","tester",36000));
		employees.put(3,new Employee(3,"thomas","developer",44000));
		employees.put(4,new Employee(4,"Aurthur","Manager",65000));
		
	}
	public static Map<Integer , Employee> getEmployeeList()
	{
		return employees;
		
	}
}
