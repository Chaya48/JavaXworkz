package com.xworkz.app.boot;

import com.xworkz.app.Area;
import com.xworkz.app.Building;
import com.xworkz.app.Corporator;
import com.xworkz.app.Floor;
import com.xworkz.app.HomeTown;
import com.xworkz.app.Lift;
import com.xworkz.app.Players;
import com.xworkz.app.Sport;

public class SportRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in Sport Runner");
		String name="Criccket";
		
		Lift lift=new Lift(1);
		Lift lift1=new Lift(2);
		
		Lift[] lifts= {lift,lift1};
		
		Floor floor=new Floor("first Floor",1);
		Floor floor1=new Floor("second Floor",2);
		Floor floor2=new Floor("third Floor",3);
		Floor floor3=new Floor("Fourth Floor",4);
		Floor floor4=new Floor("fifth Floor",5);
		Floor floor5=new Floor("sixth Floor",6);
		Floor floor6=new Floor("seventh Floor",7);
		
		Floor[] floors= {floor,floor1,floor2,floor3,floor4,floor5,floor6};
		floor.printInfo();
		Building building=new Building(floors,lifts);
		Building building1=new Building(floors,lifts);
		
		Building[] buildings= {building, building1};
		
		Corporator corporator=new Corporator("Shri",buildings);
		
		Area area=new Area();
		Area area1=new Area();

		
		Area[] areas= {area, area1};
		
		HomeTown town=new HomeTown("bangalore",590061,areas);
		
		Players player=new Players("virat",20,town,building);
		Players player1=new Players("ABD",18,town,building1);
		
		Players[] players= {player, player1};
		
		Sport sport=new Sport(name,players);
		sport.printInfo();
	}

}

