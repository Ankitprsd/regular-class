package com.Techment.day4.polymorphism;

class Bank
{
	public void rateOfInterest()
	{
		System.out.println("3% ");
	}
}
class SBI extends Bank
{
	public void rateOfInterest()
	{
	//	@override
		System.out.println("5% ");
	}
}
class Axis extends Bank
{
	public void rateOfInterest()
	{
		// @override
		System.out.println("7% ");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		Axis axis = new Axis();
		sbi.rateOfInterest();
		axis.rateOfInterest();

	}

}
