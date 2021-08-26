package com.techment.service;

import java.util.List;

import com.techment.dao.IEmployeeDao;
import com.techment.modal.Employee;

public interface IService extends IEmployeeDao {

	Employee getEmployeeById(int id);
	List<Employee> getEmployeeByDept(String dept);
}
