package com.techment.modal;

public class Address {
	
	private String addressLine;
	String city;
	String state;
	String country;  
	  


	/**
	 * @param addressLine
	 * @param city
	 * @param state
	 * @param country
	 */
	public Address(String addressLine, String city, String state, String country) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.country = country;
	}



	public void displayInformation(){
	System.out.println(addressLine+" "+city+" "+state+" "+country);
	}


}
