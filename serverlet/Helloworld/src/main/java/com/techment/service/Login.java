package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		System.out.println("Servlet is called");
		PrintWriter out = response.getWriter();
		out.print("hello this is my very first servlet<br><br>");
		
		String name = request.getParameter("admin");
		String pass = request.getParameter("admin");
		
		int nameLength = name.length();
		out.print("your name is"+name+"size of name is " + nameLength);
	}

}
