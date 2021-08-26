package com.techment.exception;

import com.techment.exception.Customer.InvalidInputException;

class Customer {

	private String custNo;
	private String custName;
	private String category;

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", category=" + category + "]";
	}

	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		super();
		
		if(custNo.startsWith("C") || custNo.startsWith("c"))
		
		{
			if(custName.length()>=4)
			{
				if(category=="Platinum"||category=="Gold"||category=="Silver") {
					
					this.category=category;
					this.custName=custName;
					this.custNo=custNo;
					
				}else {
					throw new InvalidInputException("category must be either ‘Platinum’, ‘Gold’ or ‘Silver ‘");
				}
				
			}else {
				throw new InvalidInputException("custName should greater than 4");
			}
			
		}
		else {
			throw new InvalidInputException("custNostart with c or C");
		}
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public class InvalidInputException extends Exception {

		public InvalidInputException(String inbox) {
			// TODO Auto-generated constructor stub
			//super(inbox);
		}

	}


}

public class Question2 {

	public static void main(String[] args) throws InvalidInputException {
		// TODO Auto-generated method stub
		
		try {
			Customer customer1 = new Customer("i1","lalit","Gold");
			System.out.println(customer1);
		}catch(InvalidInputException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
