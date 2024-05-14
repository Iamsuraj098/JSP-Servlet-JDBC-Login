package com.Whole_Login;

import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
//import java.lang.reflect.Member;
import java.lang.ClassNotFoundException;
import java.sql.*;

//import java.util.Scanner;
@WebServlet("/forget/SetPassword")
public class SetPassword extends HttpServlet {

	private static final long serialVersionUID = 1L;
	// creating the connection between the my database and java:
	private static final String url = "jdbc:mysql://127.0.0.1:3306/authentication";
	private static final String username = "root";
	private static final String password = "122436";

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			out.println(e.getMessage());
		}

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();

			String new_password = req.getParameter("ConfirmPassword");
			String email = req.getParameter("email1");
			String query = String.format("UPDATE record set password = '%s' where email_id = '%s'", new_password, email);
			int rowAffected = statement.executeUpdate(query);
			if(rowAffected > 0) {
				connection.commit();
				RequestDispatcher rd = req.getRequestDispatcher("/landingPage/index.jsp");
				String goback = "Go Back to Login Page";
				req.setAttribute("lable1", "Password Changed");
				req.setAttribute("lable2", goback);
				rd.forward(req, res);
//				out.println("All DOne");
			}
		} catch (SQLException e) {
			out.println(e.getMessage());
		}
		out.close();

	}
}
