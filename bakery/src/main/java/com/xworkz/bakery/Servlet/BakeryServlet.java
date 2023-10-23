package com.xworkz.bakery.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/bakery",loadOnStartup = 2)
public class BakeryServlet extends HttpServlet{

	public BakeryServlet() {
		System.out.println("create the bakeryServlet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the bakeryServlet");
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String quantity=req.getParameter("quantity");
		String discount=req.getParameter("discount");
		String gst=req.getParameter("gst");
		String mnDate=req.getParameter("mnDate");
		String exDate=req.getParameter("exDate");
		String date=req.getParameter("date");
		String time=req.getParameter("time");
		
		
		req.setAttribute("name", name);
		req.setAttribute("price", price);
		req.setAttribute("quantity", quantity);
		req.setAttribute("discount", discount);
		req.setAttribute("gst", gst);
		req.setAttribute("mnDate", mnDate);
		req.setAttribute("exDate", exDate);
		req.setAttribute("date", date);
		req.setAttribute("time", time);
		RequestDispatcher dispatcher=req.getRequestDispatcher("BakerySuccess.jsp");
		dispatcher.forward(req, resp);
	}
}
