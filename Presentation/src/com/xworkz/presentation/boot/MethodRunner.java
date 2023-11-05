package com.xworkz.presentation.boot;

import com.xworkz.presentation.app.Method;

public class MethodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in methodRunner");
		Method method = new Method();
		method.name="sja";
		method.age=12;
		method.person();
		method.person("chaya");
		Method.calling();
		Method.calling(12);
		
	}

}
