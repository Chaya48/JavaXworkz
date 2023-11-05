package com.xworkz.boot;

public class IntegerRunner {

	public static void main(String[] args) {

		Integer integer=new Integer(100);
		int ref=integer.valueOf(9);
		System.out.println(ref);
		Object ref1=integer.toString(ref,81);
		System.out.println(ref1);
		String ref2=integer.toUnsignedString(8);
		System.out.println(ref2);
		String ref3=integer.toBinaryString(5);
		System.out.println(ref3);
		String ref4=integer.toHexString(65);
		System.out.println(ref4);
		byte ref5=integer.byteValue();
		System.out.println(ref5);
		int ref6=integer.compareTo(integer);
		System.out.println(ref6);
		double ref7=integer.doubleValue();
		System.out.println(ref7);
		float ref8=integer.floatValue();
		System.out.println(ref8);
		long ref9=integer.longValue();
		System.out.println(ref9);
	}

}
