package com.techment.modal;

import org.springframework.stereotype.Repository;

@Repository
public class Mazza implements ISoftDrink {

	public void drink() {
		System.out.println("you can drink chilled mazza");

	}

}
