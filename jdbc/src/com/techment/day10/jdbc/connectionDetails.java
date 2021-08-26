package com.techment.day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionDetails {

	public static Connection getConnected() throws Exception
	{
	Class.forName(ConnectionProperty.DRIVER_NAME);
		Connection con=DriverManager.getConnection(ConnectionProperty.URL,ConnectionProperty.PASWORD,ConnectionProperty.USERNAME);
	return con;
	

	}

}
