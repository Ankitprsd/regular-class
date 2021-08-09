package com.Techment.abstraction;


abstract class Bank
{
	void Eligiblity()
	{
		System.out.println("above 18 can open an account");
		
	}
	abstract int rateOfInterest(int interestRate);
}
//when any class extends abstract class means, it need to provide implementation for abstract method.
class Axis extends Bank
{

	@Override
	int rateOfInterest(int interestRate) {
		interestRate = 2*interestRate;
		return 0;
	}
	
}

class Kotak extends Bank
{

	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("Kotak bank "+ interestRate);
		return interestRate;
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Bank bank = new Kotak();
		System.out.println(bank.rateOfInterest(5));

	}

}
