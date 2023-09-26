package com.greetingservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GreetingServlet extends HttpServlet {

	public void  doGet(HttpServletRequest req, HttpServletResponse res) {
		
		String name = (String) req.getParameter("personName");
		
		try {
			PrintWriter out = res.getWriter();
			System.out.println(name.length());
			if(name.length() != 0 ) {
				out.println("Hello "+name+", have a good day!");
			}else {
				out.println("Enter correct input");
				
			}
			
			
		}catch( IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
}
