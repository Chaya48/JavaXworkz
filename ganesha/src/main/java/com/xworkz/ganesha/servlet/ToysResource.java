package com.xworkz.ganesha.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/toys", loadOnStartup = 1)
public class ToysResource extends HttpServlet {

	public ToysResource() {
		System.out.println("create the ToyResource");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse reqp) throws ServletException, IOException {
		System.out.println("running the toysResourece");
		String toyName = req.getParameter("toyName");
		String color = req.getParameter("color");
		String idealFor = req.getParameter("idealFor");
		String age = req.getParameter("minAge");
		String quantity = req.getParameter("quantity");
		System.out.println("toy name is :"+toyName);
		System.out.println("color is :"+color);
		System.out.println("idealFor :"+idealFor);
		System.out.println("minAge is :"+age);
		System.out.println("quantity is :"+ quantity);
	}
}
