package com.xworkz.loan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loan", loadOnStartup = 2)
public class LoanApplyServlet extends HttpServlet {
	public LoanApplyServlet() {
		System.out.println("creating the LoanApplyServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in LoanApplyServlet");

		String name = req.getParameter("name");
		String amount = req.getParameter("amount");
		String working = req.getParameter("working");
		String interest = req.getParameter("interest");
		String surety = req.getParameter("surety");
		String company = req.getParameter("company");
		String loanTenure = req.getParameter("loanTenure");
		String loanType = req.getParameter("loanType");

		System.out.println("Name is :" + name);
		System.out.println("Amount is :" + amount);
		System.out.println("Working " + working);
		System.out.println("Interest is :" + interest);
		System.out.println("surety is :" + surety);
		System.out.println("company n is :" + company);
		System.out.println("Loan Tenure :" + loanTenure);
		System.out.println("loantype is :" + loanType);

		req.setAttribute("name", name);
		req.setAttribute("amount", amount);
		req.setAttribute("working", working);
		req.setAttribute("interest", interest);
		req.setAttribute("surety", surety);
		req.setAttribute("company", company);
		req.setAttribute("loanTenure", loanTenure);
		req.setAttribute("loanType", loanType);
		RequestDispatcher dispatcher = req.getRequestDispatcher("loanApplySuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
