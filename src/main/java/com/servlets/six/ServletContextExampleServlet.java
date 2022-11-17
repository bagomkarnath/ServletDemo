package com.servlets.six;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextExampleServlet
 */
@WebServlet("/servlet-context-example")
public class ServletContextExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextExampleServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = getServletContext();
		String applicationName = servletContext.getInitParameter("applicationName");
		response.getWriter().append("Application name is (context): " + applicationName).append("\n");
		
		ServletConfig servletConfig = getServletConfig();
		String driver = servletConfig.getInitParameter("databaseDriver");
		response.getWriter().append("Database driver is (config): " + driver);
	}

}
