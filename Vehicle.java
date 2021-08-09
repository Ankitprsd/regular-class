package com.Techment.abstraction;

public interface Vehicle {
	int MAX_SPEED=90; //this is how we initialise all the variable is final,static,public.
	
	void vehicleInfo(); //all the methods are abstract only inside interface.

	void seatCapacity();
}
class XUV implements Vehicle
{
	
	public void vehicleInfo()
	{
		System.out.println("it is of XUV type");
	}
	public void seatCapacity()
	{
		System.out.println("its capacity is 8");
	}
}

class HachBack implements Vehicle
{
	public void vehicleInfo()
	{
		System.out.println("it is of HatchBack type");
	}


	@Override
	public void seatCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Its capacity is 5");
		
	}
}

class vehicleApp
{
public static void main(String[] args)
{
	Vehicle vehicle = new Vehicle();
	vehicle.seatCapacity();
}
}