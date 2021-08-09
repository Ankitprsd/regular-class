package com.Techment.day5.oops;

class Car
{
	String modelNo;
	String name;
	Engine engine; //object reference(has-a relation)

	

	public Car(String modelNo, String name, Engine engine) {
		super();
		this.modelNo = modelNo;
		this.name = name;
		this.engine = engine;
	}



	void displayCarInfo()
	{
		System.out.println("modelNo :"+ modelNo);
		System.out.println("name :"+ name);
		System.out.println("id "+ engine.id);
		System.out.println("engineType :"+ engine.engineType);
		
	}
	
}

class Engine
{
	String id;
	String engineType;
	public Engine(String id, String engineType) 
	{
		super();
		this.id = id;
		this.engineType = engineType;
	}
}
		

public class HasARealtionCar {

	public static void main(String[] args) 
	{
     Engine engine = new Engine("turbo","diesel");
     Car car = new Car("T10","Mahindra Thar");
	
	car.displayCarInfo();
	}

}
