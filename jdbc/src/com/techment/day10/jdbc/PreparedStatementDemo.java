package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{   
			//to call class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("class is found");
			System.out.println("driver class loaded");
			
			//step 2 create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root", "0636");
			System.out.println("Connected");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, 90);
			ps.setString(2, "Lalit");
			ps.setInt(3,24000);
			
			ps.execute();
			System.out.println("Inserted");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
