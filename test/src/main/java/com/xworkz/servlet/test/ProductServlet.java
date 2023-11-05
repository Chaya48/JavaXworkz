package com.xworkz.servlet.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produ", loadOnStartup = 2)
public class ProductServlet extends HttpServlet {
	
	
	public ProductServlet() {
		System.out.println("create the productServlet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running in productServlet");
		
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		String discount=req.getParameter("discount");
		
		req.setAttribute("name", name);
		req.setAttribute("price", price);
		req.setAttribute("type", type);
		req.setAttribute("discount", discount);
		RequestDispatcher dispatcher=req.getRequestDispatcher("productSucess.jsp");
		dispatcher.forward(req, resp);
	}

}
