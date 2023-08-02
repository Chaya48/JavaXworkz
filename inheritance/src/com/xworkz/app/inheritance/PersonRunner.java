package com.xworkz.app.inheritance;

import com.xworkz.app.boot.inheritance.one.Father;
import com.xworkz.app.boot.inheritance.one.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person=new Person();
		person.personMethod();
		System.out.println("\n");
		
		Person father=new Father();
		Father father1=new Father();
		father.personMethod();
		father1.fatherMethod();
	}
}
