package com.xworkz.poc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login", loadOnStartup = 2)
public class LoginServlet extends HttpServlet {
	public LoginServlet() {
		System.out.println("creating LoginServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the login Servlet");

		String user = req.getParameter("user");
		String password = req.getParameter("password");
		
		if (user.equals("admin") && password.equals("secret")) {
			req.setAttribute("user", user);
			RequestDispatcher dispatcher = req.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(req, resp);
		} else {
			req.setAttribute("userId", "Credential Not Matching");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
			dispatcher.forward(req, resp);

		}

	}
}
