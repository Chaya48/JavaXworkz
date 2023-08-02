package com.xworkz.app.inheritance;

import com.xworkz.app.boot.inheritance.six.Animals;
import com.xworkz.app.boot.inheritance.six.Cat;
import com.xworkz.app.boot.inheritance.six.Dog;
import com.xworkz.app.boot.inheritance.six.Elephant;
import com.xworkz.app.boot.inheritance.six.Giraffe;
import com.xworkz.app.boot.inheritance.six.Lion;
import com.xworkz.app.boot.inheritance.six.Tiger;

public class AnimalRunner {

	public static void main(String[] args) {
	
		Animals animal=new Animals();
		animal.animalMethod();
		System.out.println("\n");
		
		Animals cat=new Cat();
		Cat cat1=new Cat();
		cat.animalMethod();
		cat1.catMethod();
		System.out.println("\n");
		
		Animals dog=new Dog();
		Cat dog1=new Dog();
		Dog dog2=new Dog();
		dog.animalMethod();
		dog1.catMethod();
		dog2.dogMethod();
		System.out.println("\n");
		
		Animals elephant=new Elephant();
		Cat elephant1=new Elephant();
		Dog elephant2=new Elephant();
		Elephant elephant3=new Elephant();
		elephant.animalMethod();
		elephant1.catMethod();
		elephant2.dogMethod();
		elephant3.elephantMethod();
		System.out.println("\n");
		
		Animals giraffe=new Giraffe();
		Cat giraffe1=new Giraffe();
		Dog giraffe2=new Giraffe();
		Elephant giraffe3=new Giraffe();
		Giraffe giraffe4=new Giraffe();
		giraffe.animalMethod();
		giraffe1.catMethod();
		giraffe2.dogMethod();
		giraffe3.elephantMethod();
		giraffe4.giraffeMethod();
		System.out.println("\n");
		
		Animals lion=new Lion();
		Cat lion1=new Lion();
		Dog lion2=new Lion();
		Elephant lion3=new Lion();
		Giraffe lion4=new Lion();
		Lion lion5=new Lion();
		lion.animalMethod();
		lion1.catMethod();
		lion2.dogMethod();
		lion3.elephantMethod();
		lion4.giraffeMethod();
		lion5.lionMethod();
		System.out.println("\n");
		
		Animals tiger=new Tiger();
		Cat tiger1=new Tiger();
		Dog tiger2=new Tiger();
		Elephant tiger3=new Tiger();
		Giraffe tiger4=new Tiger();
		Lion tiger5=new Tiger();
		Tiger tiger6=new Tiger();
		tiger.animalMethod();
		tiger1.catMethod();
		tiger2.dogMethod();
		tiger3.elephantMethod();
		tiger4.giraffeMethod();
		tiger5.lionMethod();
		tiger6.tigerMethod();
	}

}
