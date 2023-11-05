package com.xworkz.presentation.app;

public class LocalVariable {
	public static void main(String[] args) {
		String name="chaya";
		System.out.println(name);
		
		
		InstanceVariable variable=new InstanceVariable("hassan");
		variable.name="sushma";
		InstanceVariable.age=21;
		variable.person("puma");
		InstanceVariable.qualification();
	}


}
