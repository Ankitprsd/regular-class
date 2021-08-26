package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.techment.modal.Restraunt;
import com.techment.modal.Tea;


@org.springframework.stereotype.Service
public class Service {
	

	@Autowired
	@Qualifier("tea")
	Tea tea;
	
	@Autowired
	Restraunt restraunt;

	public void displayServiceInfo()
	{
	
		//System.out.println(restraunt.displayRestrauntDetails());
		System.out.println(tea.message());

	}
	

}
