package com.servlets.five;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/registrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("USING POST").append("\n")
			.append("First name : " + request.getParameter("firstName")).append("\n")
			.append("Last name : " + request.getParameter("lastName")).append("\n")
			.append("Age : " + request.getParameter("age"));
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("USING GET").append("\n")
			.append("First name : " + request.getParameter("firstName")).append("\n")
			.append("Last name : " + request.getParameter("lastName")).append("\n")
			.append("Age : " + request.getParameter("age"));
	}

}
