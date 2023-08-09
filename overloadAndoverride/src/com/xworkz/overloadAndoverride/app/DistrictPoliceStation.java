package com.xworkz.overloadAndoverride.app;

public class DistrictPoliceStation extends PoliceStation{
public DistrictPoliceStation() {
	System.out.println("invoking no-args onstructor in DistrictPoliceStation");
}
@Override
public void preventsCrime() {
	System.out.println("invoking no-args in DistrictPoliceStation");
}

@Override
public void preventsCrime(String name) {
	System.out.println("invoking String parameter in DistrictPoliceStation");
}

@Override
public void preventsCrime(String name, String location) {
	System.out.println("invoking String,String parameter in DistrictPoliceStation");
}

@Override
public void preventsCrime(String name, String location, int number) {
	System.out.println("invoking String,String,int parameter in DistrictPoliceStation");
}

@Override
public void preventsCrime(String name, String location, int number, float open) {
	System.out.println("invoking String,String,int,float parameter in DistrictPoliceStation");
}

@Override
public void preventsCrime(String name, String location, int number, float open, float close) {
	System.out.println("invoking String,String,int,float,float  parameter in DistrictPoliceStation");
}
}
