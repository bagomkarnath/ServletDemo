package com.servlets.third;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class NoAnnotationsServlet
 */

public class NoAnnotationsServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoAnnotationsServlet() {
        super();
    }

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		pw.print("This servlet is an example of servlets defined in Deployment descriptor"); 
		
	}
	
}
