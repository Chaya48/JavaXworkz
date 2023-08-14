package com.xworkz.abs.boot;

import com.xworkz.abs.app.Degree;
import com.xworkz.abs.app.Education;

public class EducationRunner {

	public static void main(String[] args) {
		
		Education degree=new Degree();
		degree.marks();
		degree.fest();
		degree.sports();
		degree.classroom();
		degree.lacture();
	}
}
