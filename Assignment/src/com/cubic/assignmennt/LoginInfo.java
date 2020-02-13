package com.cubic.assignmennt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginInfo
 */
@WebServlet("/LoginDemo")
public class LoginInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/<html>");
		PrintWriter out = response.getWriter();
		
		out.print("<html> <body>");
		out.print("<form action = 'LoginDemo' method='post'> ");
		out.print("First name <input type='text' name='firstName'/> <br>");
		out.print("Last name <input type='text' name='lasttName'/> <br>");
		out.print("<input type ='Submit' value = 'save'/> <br> ");
		
		out.print("</form>");
		out.print("</body> </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fName = req.getParameter("firstName");
		String lName = req.getParameter("lastName");
		
		resp.setContentType("text/<html>");
		PrintWriter out = resp.getWriter();
		
		out.print("<html> <body>");
		out.print(" Entered values are:  <br>");
		out.print("First name : <b>" +fName+"</b> <br>");
		out.print("Last name : <b>" +lName+"</b> <br>");
		
		out.print("</body> </html>");
		}

}
