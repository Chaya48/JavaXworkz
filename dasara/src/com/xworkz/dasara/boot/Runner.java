package com.xworkz.dasara.boot;

import java.beans.PropertyVetoException;

import com.xworkz.dasara.event.Mysuru;
import com.xworkz.dasara.exception.zooException;

public class Runner {

	public static void main(String[] args) {

		Mysuru mysuru = new Mysuru();

		mysuru.flowerShow();
		try {
			mysuru.ambari();
			try {
				Class.forName("com.just.not.work");
			} catch (ClassNotFoundException e) {
				System.err.println("class not found " + e.getMessage());
			}
		} catch (PropertyVetoException e) {
			System.err.println("propertyVeto " + e.getMessage());
		} catch (zooException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
	}
	

}
