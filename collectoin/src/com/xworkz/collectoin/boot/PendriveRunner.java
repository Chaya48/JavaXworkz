package com.xworkz.collectoin.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectoin.app.dto.PendriveDTO;

public class PendriveRunner {

	public static void main(String[] args) {

		PendriveDTO prndrive = new PendriveDTO("16GB", "hp", true, 180);
		PendriveDTO prndrive2 = new PendriveDTO("64GB", "sandisk", true, 280);
		PendriveDTO prndrive3 = new PendriveDTO("128GB", "kingston", false, 380);
		PendriveDTO prndrive4 = new PendriveDTO("256GB", "acer", false, 480);
		PendriveDTO prndrive5 = new PendriveDTO("1TB", "samsung", true, 18);

		Collection<PendriveDTO> drive = new ArrayList<PendriveDTO>();
		drive.add(prndrive);
		drive.add(prndrive2);
		drive.add(prndrive3);
		drive.add(prndrive4);
		drive.add(prndrive5);

		for (PendriveDTO pendriveDTO : drive) {
			System.out.println(pendriveDTO);
		}
		System.out.println();

		drive.stream().sorted().forEach(p -> System.out.println(p));
	}

}
