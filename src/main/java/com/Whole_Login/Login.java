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
@WebServlet("/Home/Login")
public class Login extends HttpServlet {

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

		String req_name = req.getParameter("userid");
		String req_password = req.getParameter("passwordid");

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();

			String query = String.format("SELECT * FROM record WHERE name='%s' AND password='%s'", req_name,
					req_password);
			ResultSet resultset = statement.executeQuery(query);
//			out.println(resultset.next());
			while (resultset.next()) {
				String cmp_name = resultset.getString("name");
				String cmp_password = resultset.getString("password");
				if (cmp_name.equals(req_name) && cmp_password.equals(req_password)) {
					RequestDispatcher rd = req.getRequestDispatcher("/landingPage/index.jsp");
					req.setAttribute("lable1", "Welcome back " + cmp_name);
					req.setAttribute("lable2", "Log Out");
					rd.forward(req, res);
				}
			}
			if (!resultset.next()) {
				RequestDispatcher rd = req.getRequestDispatcher("IndexNext.jsp");
				req.setAttribute("password", "Password not matched");
				rd.forward(req, res);
			}
		} catch (SQLException e) {
			out.println(e.getMessage());
		}
		out.close();

	}
}
