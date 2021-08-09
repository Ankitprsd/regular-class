package com.Techment.day4.oops;

interface JdbcConnection
{
	void Connect();
	
}
class Oracle implements JdbcConnection
{

	@Override
	public void Connect() {
		System.out.println("connecting to Oracle connection");
		
	}
	
}
class Mysql implements JdbcConnection
{

	@Override
	public void Connect() {
		System.out.println("connecting to Mysql connection");
		
	}
	
}

public class interfaceConnection {

	public static void main(String[] args) {
		JdbcConnection c1 = new Oracle();
		JdbcConnection c2 = new Mysql();
		
		c1.Connect();
		c2.Connect();
		

	}

}
