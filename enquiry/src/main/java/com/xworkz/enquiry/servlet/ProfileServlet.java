package com.xworkz.enquiry.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.enquiry.servlet.dto.ProfileDTO;
@WebServlet(urlPatterns = "/profile" , loadOnStartup = 2)
public class ProfileServlet extends HttpServlet{

	public ProfileServlet() {
		System.out.println("create the profileServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in profileServlet");
		String name = req.getParameter("name");
		String mobileNumber = req.getParameter("mobileNo");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String location = req.getParameter("location");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirm");
		
		
		ProfileDTO dto=new ProfileDTO(name, mobileNumber, email, dob, location, password, confirmPassword);
		req.setAttribute("profile", dto);
		RequestDispatcher dispatcher=req.getRequestDispatcher("ProfileSuccess.jsp");
		dispatcher.forward(req, resp);
	}
}
