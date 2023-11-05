package com.xworkz.ps.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ps", loadOnStartup = 2)
public class PoliceStationResource extends HttpServlet {

	public PoliceStationResource() {
		System.out.println("create the PoliceStationResource");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the PoliceStationResource");
		String name=req.getParameter("name");
		String location=req.getParameter("location");
		String inspector=req.getParameter("inspector");
		String si=req.getParameter("si");
		String head=req.getParameter("head");
		String assistant=req.getParameter("assistant");
		String cells=req.getParameter("cells");
		String cases=req.getParameter("cases");
		String painted=req.getParameter("gridRadios"); 
		System.out.println("Name is :"+name);
		System.out.println("location is :"+location);
		System.out.println("inspector is :"+inspector);
		System.out.println("si name is :"+si);
		System.out.println("head Constable name is :"+head);
		System.out.println("assistant commissionor  is :"+assistant);
		System.out.println("No Of cells is :"+cells);
		System.out.println("No Of cases is pending  :"+cases);
		System.out.println("painted :"+painted);
		
		int convertedCases=Integer.parseInt(cases);
		int convertedCells=Integer.parseInt(cells);
		boolean convertedPainted=Boolean.parseBoolean(painted);
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.print("<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "    <title>X-workz</title>\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n"
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ " <nav class=\"navbar navbar-expand-lg bg-primary\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\" href=\"index.html\">Home</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"ps.html\">PoliceStation</a>\r\n"
				+ "        </li>\r\n"
				+ "          </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+"<div align=center>"
				+ "<h3 >Police Station Information saved successfully</h3>\r\n"
				+"</div>"
				+ "<h3>Station Name is :"+name+" </h3>\r\n"
				+ "<h3>loacation is :"+location+"</h3>\r\n"
			    + "<h3>Inspector Name is :"+inspector+" </h3>\r\n"
				+ "<h3>SI Name is :"+si+"</h3>\r\n"
				+ "<h3>Head Constable Name is :"+head+" </h3>\r\n"
				+ "<h3>Assistant commissionor Name is :"+assistant+"/h3>\r\n"
				+ "<h3>No Of cells is :"+cells+"</h3>\r\n"
				+ "<h3>No Of cases  is :"+cases+"</h3>\r\n"
				+ "<h3>painted is :"+painted+"</h3>\r\n"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
		if(convertedCases > 100) {
			writer.print("\n<span style=color:green><h3>Too many cases pending</h3></span>\n</br>");
		}
		else {
			writer.print("\n<span style=color:red><h3>Less cases</h3></span>\n</br>");
		}
		if(convertedCells > 5) {
			writer.print("\n<span style=color:green><h3>Big Station</h3></span>\n</br>");
		}
		else {
			writer.print("\n<span style=color:red><h3>Small Station</h3></span>\n</br>");
		}
		if(convertedPainted==true) {
			writer.print("\n<span style=color:green><h3>Clean</h3></span>\n</br>");	
			}
		else {
			writer.print("\n<span style=color:red><h3>Dirty</h3></span>\n</br>");
		}
	}
}
