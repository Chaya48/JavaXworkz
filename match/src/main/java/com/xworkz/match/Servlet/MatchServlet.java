package com.xworkz.match.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/match", loadOnStartup = 2)
public class MatchServlet extends HttpServlet {
	public MatchServlet() {
		System.out.println("create the MatchServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the MatchServlet");
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String date=req.getParameter("date");
		String team1=req.getParameter("team1");
		String team2=req.getParameter("team2");
		String team1CName=req.getParameter("team1CName");
		String team2CName=req.getParameter("team2CName");
		String umpireName=req.getParameter("umpireName");
		String stadiumName=req.getParameter("stadiumName");
		String thirdUmpireName=req.getParameter("thirdUmpireName");
		String stadiumCapacity=req.getParameter("stadiumCapacity");
		
		req.setAttribute("name", name);
		req.setAttribute("country", country);
		req.setAttribute("date", date);
		req.setAttribute("team1", team1);
		req.setAttribute("team2", team2);
		req.setAttribute("team1CName", team1CName);
		req.setAttribute("team2CName", team2CName);
		req.setAttribute("umpireName", umpireName);
		req.setAttribute("stadiumName", stadiumName);
		req.setAttribute("thirdUmpireName", thirdUmpireName);
		req.setAttribute("stadiumCapacity", stadiumCapacity);
		RequestDispatcher dispatcher = req.getRequestDispatcher("MatchSuccess.jsp");
		dispatcher.forward(req, resp);
	}
}
