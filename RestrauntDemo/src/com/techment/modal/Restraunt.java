package com.techment.modal;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Restraunt {
	
	
	String restrauntName;
	IHotDrink hotdrink;
	ISoftDrink softdrink;
	List<String> employeesName;
	
	


 public void displayRestrauntDetails()
	{
		System.out.println("Restraunt Name :"+restrauntName);
		//System.out.println("Price of tea :"+tea.price);
		//tea.message();
		hotdrink.drink();
		softdrink.drink();
		
		 System.out.println("Employee Names are:");  
		    Iterator<String> itr=employeesName.iterator();  
		    while(itr.hasNext()){  
		        System.out.println(itr.next());  
		    }  
	}

}
