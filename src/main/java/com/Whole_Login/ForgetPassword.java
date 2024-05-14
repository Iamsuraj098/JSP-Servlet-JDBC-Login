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
@WebServlet("/forget/ForgetPassword")
public class ForgetPassword extends HttpServlet {

	public void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		String email = requset.getParameter("emailid");
		RequestDispatcher rd = requset.getRequestDispatcher("OTP.jsp");
		requset.setAttribute("email", email);
		rd.forward(requset, response);
		out.close();

	}
}
