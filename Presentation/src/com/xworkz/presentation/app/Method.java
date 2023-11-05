package com.xworkz.presentation.app;

public class Method {

	public String name;
	public int age;
	
	public  void person() {
		System.out.println("invoking no-args in person");
	}
	public  void person(String name) {
		System.out.println("invoking string in person");
	}
	public static void calling() {
		System.out.println("invoking no-arg in calling");
			}
	public static void calling(int age) {
		System.out.println("invoking int in calling");
	}
	public Method() {
System.out.println("invoking no-args constr in method");
this.age=age;
	}
}
