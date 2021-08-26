package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConnectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//step 1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("class is found");
			System.out.println("driver class loaded");
			
			//step 2 create the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root", "0636");
			System.out.println("Connected");
			
			Statement stmt = con.createStatement();
			//stmt.execute("insert into employee values(2,'ankit',34000);");
			//System.out.println("Inserted");
			
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next()) 
			{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
		//catch (ClassNotFoundException e) {
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
