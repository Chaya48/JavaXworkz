package com.xworkz.collectoin.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.collectoin.app.dto.OceanDTO;

public class OceanRunner {

	public static void main(String[] args) {

		OceanDTO dto = new OceanDTO("Atlantric", 106.5, 5450, "Rusya");
		OceanDTO dto2 = new OceanDTO("Indian Ocean", 7050, 7258, "India");
		OceanDTO dto3 = new OceanDTO("Pacific", 10900, 11000, "Japan");
		OceanDTO dto4 = new OceanDTO("Arabian", 3862000, 4652, "Swadi arabia");
		OceanDTO dto5 = new OceanDTO("Bay of Bengal", 1600, 4694, "Bagladesh");

		Collection<OceanDTO> ocean = new ArrayList<OceanDTO>();
		ocean.add(dto);
		ocean.add(dto2);
		ocean.add(dto3);
		ocean.add(dto4);
		ocean.add(dto5);

		for (OceanDTO oceanDTO : ocean) {
			System.out.println(oceanDTO);
		}
		System.out.println();

		ocean.stream().sorted().forEach(o -> System.out.println(o));

		System.out.println();

		Optional<OceanDTO> ref = ocean.stream().filter(oce -> oce.getLocation().equals("India")).findFirst();
		System.out.println(ref );
	}

}
