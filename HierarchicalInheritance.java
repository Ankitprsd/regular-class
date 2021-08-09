package com.Techment.day4.oops;

class Animal2
{
	void eat()
	{
		System.out.println("Eating");
		
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("barking");
	}
}
class BabyDog1 extends Animal2
{
	void play()
	{
		System.out.println("Playing");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) 
	{
		BabyDog1 b = new BabyDog1();
		Dog2 b1 = new Dog2();
		b.eat();
		b.play();
		b1.eat();
		b1.bark();

	}

}
