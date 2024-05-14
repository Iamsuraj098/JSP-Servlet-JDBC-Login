package com.Whole_Login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/OTP/SaveBioData")

public class SaveBioData extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String url = "jdbc:mysql://127.0.0.1:3306/authentication";
	private static final String username = "root";
	private static final String password = "122436";

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			out.println(e.getMessage());
		}
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			
			String name = request.getParameter("user_id");
			String password = request.getParameter("password"); 
			String mobile = request.getParameter("Mobile");
			String email_id = request.getParameter("Email_id");
			String Address = request.getParameter("Address");
			
			String query = String.format("INSERT INTO RECORD(name, password, mobile, email_id, Address) VALUES ('%s', %s, %s, '%s', '%s');", name, password, mobile, email_id, Address);
			int rowAffected = statement.executeUpdate(query);
			if(rowAffected > 0) {
				RequestDispatcher rd1 = request.getRequestDispatcher("/landingPage/index.jsp");
				request.setAttribute("lable1", "Welcome "+name);
				request.setAttribute("lable2", "Log Out");
				rd1.forward(request, response);
//				out.println(getSession());			
//				HttpSession session = request.getSession();
//				session.setAttribute("lable", email_id);
				}
			else {
				out.println("Not Run");
			}
		}catch(SQLException e) {
			out.println(e.getMessage());
		}
	}
}
