package com.Whole_Login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/forget/ForgetOTP")
public class ForgetOTP extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String match = "123";
		String take = request.getParameter("otp");
		String email = request.getParameter("email");
		if(take.compareTo(match)==0) {
			RequestDispatcher rd = request.getRequestDispatcher("NewPassword.jsp");
			request.setAttribute("email", email);
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("OTP.jsp");
			request.setAttribute("email", email);
			rd.forward(request, response);
		}
	}

}
