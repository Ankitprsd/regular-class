package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class RetriveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		try
		{
			Connection con =connectionDetails.getConnected();
			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
		}
		catch (Exception e)
		{
			
		}
				

	}

}
