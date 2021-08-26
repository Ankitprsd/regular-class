package com.techment.modal;

public class Unviversity {
	
	Department department;
	
	int noOfstudents;
	
	
	
	
//	/**
//	 * @param dept the dept to set
//	 */
//	public void setDept(Department dept) {
//		this.Dept = dept;
//	}



	/**
	 * @param noOfstudents the noOfstudents to set
	 */
	public void setNoOfstudents(int noOfstudents) {
		this.noOfstudents = noOfstudents;
	}



	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}



	public void displayDetails()
	{
		department.DeptDetails();
	}

}
