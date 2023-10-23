package com.xworkz.farmer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/farmer", loadOnStartup = 2)
public class FarmerResource extends HttpServlet {

	public FarmerResource() {
		System.out.println("create FarmerResource");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running in farmerResource");
		String name=req.getParameter("name");
		String area=req.getParameter("area");
		String soil=req.getParameter("soil");
		String crop=req.getParameter("crop");
		String fertilizer=req.getParameter("fertilizer");
		String season=req.getParameter("season");
		String invest=req.getParameter("invest");
		String profit=req.getParameter("profit");
		String record=req.getParameter("record");
		System.out.println("name is "+name);
		System.out.println("sports is "+area);
		System.out.println("place is "+soil);
		System.out.println("crop is "+crop);
		System.out.println("fertilizer is "+fertilizer);
		System.out.println("season is "+season);
		System.out.println("invest is "+invest);
		System.out.println("profit is "+profit);
		System.out.println("recordNo is "+record);
		resp.setContentType("text/plain");
		PrintWriter writer=resp.getWriter();
		writer.print(name +" is saved succesfully\n");
		writer.print(area  +" is saved succesfully\n");
		writer.print(soil  +" is saved succesfully\n");
		writer.print(crop  +" is saved succesfully\n");
		writer.print(fertilizer  +" is saved succesfully\n");
		writer.print(season  +" is saved succesfully\n");
		writer.print(invest  +" is saved succesfully\n");
		writer.print(profit  +" is saved succesfully\n");
		writer.print(record  +" is saved succesfully\n");
	
		
		
	}
}
