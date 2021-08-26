package com.techment.service;
import java.sql.*;  

public class Login {
	
	

 
	public static boolean validate(String name,String pass){  
	boolean status=false;  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root", "0636");  
	      
	PreparedStatement ps=con.prepareStatement(  
	"select * from userreg where name=? and pass=?");  
	ps.setString(1,name);  
	ps.setString(2,pass);  
	      
	ResultSet rs=ps.executeQuery();  
	status=rs.next();  
	System.out.println("You are successfully logged in...");  

	          
	}catch(Exception e){System.out.println(e);}  
	return status;  
	}  

}
