package com.Whole_Login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/OTP/Verification")
public class Verification extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String otp = request.getParameter("otp");
		String email = request.getParameter("email");
//		String email = request.getAttribute("lable").toString();
		if(otp.compareTo("123") == 0) {
//			out.println("OTP Matched");
			RequestDispatcher rd1 = request.getRequestDispatcher("BioData.jsp");
			request.setAttribute("email", email);
			rd1.forward(request, response);
		}
		else if(otp.compareTo("") == 0) {
			RequestDispatcher rd = request.getRequestDispatcher("Verifier.jsp");
			request.setAttribute("lable", otp);
			request.setAttribute("email", email);
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Verifier.jsp");
			request.setAttribute("lable", "OPT not match");
			request.setAttribute("email", email);
			rd.forward(request, response);
		}
		
	}
}
