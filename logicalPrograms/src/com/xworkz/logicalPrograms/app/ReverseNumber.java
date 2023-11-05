package com.xworkz.logicalPrograms.app;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 98765, Reverse = 0, lastDigit;
		while (n > 0) {
			lastDigit = n % 10;
			Reverse = Reverse * 10 + lastDigit;
			n = n / 10;
		}
		System.out.println(Reverse);
	}

}
