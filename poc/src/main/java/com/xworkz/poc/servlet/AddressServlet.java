package com.xworkz.poc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/address", loadOnStartup = 2)
public class AddressServlet extends HttpServlet {

	public AddressServlet() {
		System.out.println("create the AddressServlet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the AddressServlet");
		
		String no = req.getParameter("no");
		String street = req.getParameter("street");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");

		req.setAttribute("address", "Address is saved successfully");
		RequestDispatcher dispatcher = req.getRequestDispatcher("Address.jsp");
		dispatcher.forward(req, resp);
	}
}
