package com.xworkz.collectoin.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectoin.app.dto.RobotDTO;

public class RobotRunner {

	public static void main(String[] args) {

		RobotDTO dto=new RobotDTO("ABB", "cobot", true, 30);
		RobotDTO dto2=new RobotDTO("Fanuc", "domestic", false, 47);
		RobotDTO dto3=new RobotDTO("Kuka", "humanoid", true, 87);
		RobotDTO dto4=new RobotDTO("Epson", "mobile", false, 67);
		RobotDTO dto5=new RobotDTO("Pal ", "medical", true, 35);
		
		Collection<RobotDTO> robot=new ArrayList<RobotDTO>();
		robot.add(dto);
		robot.add(dto2);
		robot.add(dto3);
		robot.add(dto4);
		robot.add(dto5);
		
		for (RobotDTO robotDTO : robot) {
			System.out.println(robotDTO);
		}
		System.out.println();
		
		robot.stream().sorted().forEach(r -> System.out.println(r));
	}

}
