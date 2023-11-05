package com.xworkz.player.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player", loadOnStartup = 1)
public class playerResource extends HttpServlet {

	public playerResource() {
		System.out.println("creating the palyerResource");
	}
	

@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running the playerResource");
			String name=req.getParameter("name");
			String sport=req.getParameter("sports");
			String place=req.getParameter("place");
			String exp=req.getParameter("exp");
			System.out.println("name is "+name);
			System.out.println("sports is "+sport);
			System.out.println("place is "+place);
			System.out.println("experience is "+exp);
			resp.setContentType("text/plain");
			PrintWriter writer=resp.getWriter();
			writer.print(name +" is saved succesfully\n");
			writer.print(sport  +" is saved succesfully\n");
			writer.print(place  +" is saved succesfully\n");
			writer.print(exp  +" is saved succesfully");

}
}
