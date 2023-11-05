package com.xworkz.app;

public class Person {

	public String name="chaya";
	 private int age=21;
	 
	 public void getName() {
		 System.out.println("public ");
	 }
	 void getAge() {
		 System.out.println("defalut");
	 }
	 protected void getYear() {
		System.out.println("protected");
	}
	 private void getExperince() {
		 System.out.println("private");
	 }
}

