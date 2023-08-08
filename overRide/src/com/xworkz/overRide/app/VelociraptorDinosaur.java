package com.xworkz.overRide.app;

public class VelociraptorDinosaur extends Dinosaur {
public VelociraptorDinosaur() {
System.out.println("invoking no-args in Velociraptor");
}
@Override
public void eating() {
	System.out.println("invoking eating in Velociraptor");
}
}
