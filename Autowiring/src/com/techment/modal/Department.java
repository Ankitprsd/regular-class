package com.techment.modal;

public class Department {
	
    String hodName;
//	String ifseCode;
//	String branch;


	/**
	 * @param hodName the hodName to set
	 */
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	
	public void DeptDetails()
	{
		System.out.println("department details are present here");
		System.out.println("Hod Name :"+hodName);
//		System.out.println("Name :"+ name);
//		System.out.println("IFSE CODE :"+ ifseCode);
//		System.out.println("Branch :"+ branch);
	}

}
