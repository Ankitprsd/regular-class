package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Pratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no. of employees :");
			int num =sc.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("class is found");
			System.out.println("driver class loaded");
			
			//step 2 create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root", "0636");
			System.out.println("Connected");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			for(int i=0;i<=num;i++)
			{
				System.out.println("enter id of employees :");
				int id =sc.nextInt();
				ps.setInt(1,id);
				System.out.println("enter name of employees :");
				String name =sc.next();
				ps.setString(2,name);
				System.out.println("enter salary of employees :");
				int salary =sc.nextInt();
			}
			
			
			
			ps.execute();
			System.out.println("Inserted");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	}


