package com.Techment.day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students
{
	int id;
	String name;
	int age;
	public Students(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

class AgeSorting implements Comparator<Students>
{
	@Override
	public int compare (Students o1 , Students o2) {
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else return -1;
		
	}
	
	
}

class NameSorting implements Comparator<Students>
{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Students> s = new ArrayList<Students>();
		s.add(new Students(1,"mahesh",23));
		s.add(new Students(2,"rohit",19));
		s.add(new Students(3,"ankit",20));
		
		for(Students stu : s)
		{
			System.out.println(stu);
		}
		
		System.out.println("==========sorting by age==========");
		
		Collections.sort(s,new AgeSorting());
		
		for(Students stu : s)
		{
		System.out.println(stu);
		}
		
		System.out.println("==========Sorting by name==========");
		
Collections.sort(s,new NameSorting());
		
		for(Students stu : s)
		{
		System.out.println(stu);
		}
			

	}

}
