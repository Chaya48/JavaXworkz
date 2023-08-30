package com.xworkz.abstact.app;

public class Laptop {
	private Processor processor;

	public void fetch() {
		System.out.println("invoking fetch in laptop");
		this.processor.fetch();
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
}
