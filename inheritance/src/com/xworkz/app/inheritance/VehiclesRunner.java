package com.xworkz.app.inheritance;

import com.xworkz.app.boot.inheritance.five.Auto;
import com.xworkz.app.boot.inheritance.five.Bike;
import com.xworkz.app.boot.inheritance.five.Bus;
import com.xworkz.app.boot.inheritance.five.Car;
import com.xworkz.app.boot.inheritance.five.Cycle;
import com.xworkz.app.boot.inheritance.five.Vehicles;

public class VehiclesRunner {

	public static void main(String[] args) {
		
		Vehicles vehicle=new Vehicles();
		vehicle.vehicleMethod();
		System.out.println("\n");
		
		Vehicles car=new Car();
		Car car1=new Car();
		car.vehicleMethod();
		car1.carMethod();
		System.out.println("\n");

		Vehicles bus=new Bus();
		Car bus1=new Bus();
		Bus bus2=new Bus();
		bus.vehicleMethod();
		bus1.carMethod();
		bus2.busMethod();
		System.out.println("\n");
		
		Vehicles bike=new Bike();
		Car bike1=new Bike();
		Bus bike2=new Bike();
		Bike bike3=new Bike();
		bike.vehicleMethod();
		bike1.carMethod();
		bike2.busMethod();
		bike3.bikeMethod();
		System.out.println("\n");
		
		Vehicles cycle=new Cycle();
		Car cycle1=new Cycle();
		Bus cycle2=new Cycle();
		Bike cycle3=new Cycle();
		Cycle cycle4=new Cycle();
		cycle.vehicleMethod();
		cycle1.carMethod();
		cycle2.busMethod();
		cycle3.bikeMethod();
		cycle4.cycleMethod();
		System.out.println("\n");
		
		Vehicles auto=new Auto();
		Car auto1=new Auto();
		Bus auto2=new Auto();
		Bike auto3=new Auto();
		Cycle auto4=new Auto();
		Auto auto5=new Auto();
		auto.vehicleMethod();
		auto1.carMethod();
		auto2.busMethod();
		auto3.bikeMethod();
		auto4.cycleMethod();
		auto5.autoMethod();
	}

}
