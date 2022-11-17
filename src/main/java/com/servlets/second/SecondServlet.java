package com.servlets.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second-servlet")
public class SecondServlet extends GenericServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter pWriter = response.getWriter();
		
		pWriter.print("<html><body>");
		pWriter.print("<b>Hello World Servlet - using GenericServlet </b>");
		pWriter.print("</body></html>");
	}

}
