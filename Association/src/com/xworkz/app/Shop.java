package com.xworkz.app;

public class Shop {
	
	public Salesman salesman=new Salesman();
	public Salesman salesman1=new Salesman();
	
	public void product()
	{
		if(salesman !=null) {
			this.salesman.selling();
			System.out.println("invoking the salesman in shop");
		}
		else
		{
			System.out.println("salesman is null");
		}
	}
	public void purchase()
	{
		if(salesman1 !=null) {
			this.salesman1.collect();
			System.out.println("invoking shop in purchase");
		}
		else {
			System.out.println("purchase is null");
		}
	}

}
