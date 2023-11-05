package com.xworkz.weapon.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/weapon",loadOnStartup = 1)
public class WeaponResource extends HttpServlet{
	public WeaponResource() {
		System.out.println("creating the weaponResource");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the weaponResource");
		String name=req.getParameter("name");
		String madeBy=req.getParameter("madeBy");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		System.out.println("Name is :"+name);
		System.out.println("madeBy is :"+madeBy);
		System.out.println("price is :"+price);
		System.out.println("type is :"+type);
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
				+ "  <nav class=\"navbar navbar-dark bg-dark\">\r\n"
				+ "    <div class=\"container-fluid\">\r\n"
				+"<a class=\"navbar-brand\" href=\"index.html\">Home</a>\r\n"
				+ "      <a class=\"navbar-brand\" href=\"weapon.html\">Weapon</a>\r\n"
				+ "    </div>\r\n"
				+ "  </nav>\r\n"
				+ "  \r\n"
				+"<br>"
				+ "    <h1 align=\"center\">Weapon Information saved Successfully.......</h1>\r\n"
				+"<br>"
				+"<h3>Name is :"+name+"</h3>"
				+"<h3>Made By :"+madeBy+"</h3>"
				+"<h3>Price is  :"+price+"</h3>"
				+"<h3>Type :"+type+"</h3>"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
	}

}
