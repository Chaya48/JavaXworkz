package com.xworkz.engDTO.boot;

import java.util.Optional;

import com.xworkz.engDTO.app.util.GarageUtil;

public class GarageRunner {

	public static void main(String[] args) {

		Optional<String> optional=GarageUtil.getName("chaya","KM");
		if(optional.isPresent())
		{
			String ref=optional.get();
			System.out.println(ref);
		}
		else {
			System.out.println("optional is empty");
		}
	}

}
