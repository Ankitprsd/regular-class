package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Servlet is called");
		PrintWriter pw = response.getWriter();
		pw.print("==========Calculation==========<br><br>");
	 
		String WhichCalculation=request.getParameter("calculation");
		if(WhichCalculation.equalsIgnoreCase("ADD"))
		{
		String n1 = request.getParameter("n1");
		int num1 = Integer.parseInt(n1);
		
		String n2 = request.getParameter("n2");
		int num2 = Integer.parseInt(n2);
		
		int add = num1+num2;
		pw.println("Result of Add :"+add);
		}
		else if(WhichCalculation.equalsIgnoreCase("SUB"))
	  {
			String n1 = request.getParameter("n1");
			int num1 = Integer.parseInt(n1);
			
		    String n2 = request.getParameter("n2");
    	    int num2 = Integer.parseInt(n2);
			
		    int sub = num1-num2;
			pw.println("Result of Add :"+sub);
		}
		
		else if(WhichCalculation.equalsIgnoreCase("MUL"))
		  {
				String n1 = request.getParameter("n1");
				int num1 = Integer.parseInt(n1);
				
			    String n2 = request.getParameter("n2");
	    	    int num2 = Integer.parseInt(n2);
				
			    int mul = num1*num2;
				pw.println("Result of Add :"+mul);
			}
		
		else if(WhichCalculation.equalsIgnoreCase("DIV"))
		  {
				String n1 = request.getParameter("n1");
				int num1 = Integer.parseInt(n1);
				
			    String n2 = request.getParameter("n2");
	    	    int num2 = Integer.parseInt(n2);
				
			    int div = num1-num2;
				pw.println("Result of Add :"+div);
			}
		
		
	
	}

				
	}


