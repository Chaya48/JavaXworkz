package com.xworkz.collectoin.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectoin.app.dto.TowerDTO;

public class TowerRunner {

	public static void main(String[] args) {

		TowerDTO dto=new TowerDTO("Lattic tower", 100, 7623, 34);
		TowerDTO dto2=new TowerDTO("Telicommunication tower", 200, 723, 82);
		TowerDTO dto3=new TowerDTO("Transposition", 300, 97, 923);
		TowerDTO dto4=new TowerDTO("Bell", 4000, 234, 998);
		TowerDTO dto5=new TowerDTO("Flanking",50, 9897, 234);
		
		Collection<TowerDTO> tower=new ArrayList<TowerDTO>();
		tower.add(dto);
		tower.add(dto2);
		tower.add(dto3);
		tower.add(dto4);
		tower.add(dto5);
		
		for (TowerDTO towerDTO : tower) {
			System.out.println(towerDTO);
		}
		System.out.println();
		
		tower.stream().sorted().forEach(t -> System.out.println(t));
	}

}
