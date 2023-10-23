package com.xworkz.dasara.event;

import java.beans.PropertyVetoException;

import com.xworkz.dasara.exception.PalaceRunTimeException;
import com.xworkz.dasara.exception.zooException;

public class Mysuru {

	public void ambari() throws PropertyVetoException,zooException {
		System.out.println("ambari in mysuru");
		throw new PropertyVetoException(null, null); // checked
	}

	public void flowerShow() {
		System.out.println("flowerShow in mysuru");
		throw new PalaceRunTimeException();  //unchecked
	}
	
}
