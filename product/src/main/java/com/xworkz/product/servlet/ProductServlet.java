package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/product", loadOnStartup = 2)
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println("create the productServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running the productServlet");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String brand = req.getParameter("brand");
		String quantity = req.getParameter("quantity");
		String desc = req.getParameter("desc");

		req.setAttribute("name", name);
		req.setAttribute("type", type);
		req.setAttribute("price", price);
		req.setAttribute("brand", brand);
		req.setAttribute("quantity", quantity);
		req.setAttribute("desc", desc);
		if ( price != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("ProductSuccess.jsp");
			dispatcher.forward(req, resp);

		} else {
			req.setAttribute("errorMsg", "price is mandatory");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Product.jsp");
			dispatcher.forward(req, resp);
		}

	}
}
