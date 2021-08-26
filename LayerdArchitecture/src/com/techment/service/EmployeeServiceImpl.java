package com.techment.service;

import java.util.List;

import com.techment.dao.EmployeeDaoImpl;
import com.techment.dao.IEmployeeDao;
import com.techment.modal.Employee;

public class EmployeeServiceImpl implements IEmployeeDao {
	
	
	IEmployeeDao employeeDao =new EmployeeDaoImpl();

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByDept(dept);
	}

	
}
