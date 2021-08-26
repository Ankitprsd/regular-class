package com.techment.client;

import java.util.List;
import java.util.Scanner;

import com.techment.dao.IEmployeeDao;
import com.techment.modal.Employee;
import com.techment.service.EmployeeServiceImpl;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IEmployeeDao service =new EmployeeServiceImpl();
		
		System.out.println("======Employee Application======");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the id to fetch employe");
		int id=scanner.nextInt();
		
		Employee employee = service.getEmployeeById(id);
		System.out.println(employee);
		
		System.out.println("enter the dept to fetch employee");
		String dept=scanner.next();
		List<Employee> employees = service.getEmployeeByDept(dept);
		System.out.println(employees);
		
		

	}

}
