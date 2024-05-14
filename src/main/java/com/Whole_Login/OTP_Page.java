package com.Whole_Login;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Member;
import java.lang.ClassNotFoundException;
import java.sql.*;
import java.util.Scanner;
@WebServlet("/OTP/OTP_Page")
public class OTP_Page extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		String email = req.getParameter("Email_Id");
		String send = "OTP sent: ";
		
		send = send.concat(email);
		RequestDispatcher rd = req.getRequestDispatcher("Verifier.jsp");
		req.setAttribute("lable", send);
		req.setAttribute("email", email);
		rd.forward(req, res);
	}
}


/*package com.Whole_Login;

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

@WebServlet("/OTP/OTP_Page")

public class OTP_Page extends HttpServlet {

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
			 
			String email_id = request.getParameter("Email_Id");
			
			String query = String.format("INSERT INTO RECORD(name, password, mobile, email_id, Address) VALUES ('%s', %s, %s, '%s', '%s');", "0", "0", "0", email_id, "0");
			int rowAffected = statement.executeUpdate(query);
			if(rowAffected > 0) {
				String email = request.getParameter("Email_Id");
				String abbre = "OTP sent: ";
				abbre = abbre.concat(email);
				RequestDispatcher rd = request.getRequestDispatcher("Verifier.jsp");
				request.setAttribute("lable", abbre);
				request.setAttribute("identity", email);
				rd.forward(request, response);
				}
			else {
				out.println("Not Run");
			}
		}catch(SQLException e) {
			out.println(e.getMessage());
		}
	}
}

*/