package com.xworkz.collectoin.stream.boot;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collectoin.stream.dto.GameDTO;

public class GameRunner {

	public static void main(String[] args) {

		GameDTO dto = new GameDTO(1, "Cricket", 22, 100, LocalDate.of(2023, 11, 06), "India", "Australia",
				LocalTime.of(7, 30));
		GameDTO dto2 = new GameDTO(2, "Football", 22, 150, LocalDate.of(2023, 11, 05), "Spurs", "Chelsea",
				LocalTime.of(5, 45));
		GameDTO dto3 = new GameDTO(3, "Kabbadi", 16, 40, LocalDate.of(2023, 11, 04), "Bengaluru Bulls",
				"Tamil Thalaivas", LocalTime.of(0, 50));
		GameDTO dto4 = new GameDTO(4, "Marathon", 10, 40, LocalDate.of(2021, 8, 8), "E.Kipchoge", "A.Nageeye",
				LocalTime.of(2, 9));
		GameDTO dto5 = new GameDTO(5, "BasketBall", 16, 90, LocalDate.of(2021, 8, 9), "United States", "Japan",
				LocalTime.of(1, 05));
		GameDTO dto6 = new GameDTO(6, "Boxing", 2, 5, LocalDate.of(2021, 8, 7), "K.Harrington", "B.Ferreira",
				LocalTime.of(0, 25));
		GameDTO dto7 = new GameDTO(7, "HandBall", 16, 30, LocalDate.of(2023, 9, 8), "Fance", "Norway",
				LocalTime.of(2, 20));
		GameDTO dto8 = new GameDTO(8, "Rhythmic gymnastics", 2, 92, LocalDate.of(2023, 8, 16), "Bulagaria", "ROC",
				LocalTime.of(3, 20));
		GameDTO dto9 = new GameDTO(9, "Track Cycling", 18, 30, LocalDate.of(2023, 7, 15), "K.Mitchell", "O.starikova",
				LocalTime.of(4, 38));
		GameDTO dto10 = new GameDTO(10, "Water Polo", 27, 13, LocalDate.of(2023, 8, 8), "Serbia", "Greece",
				LocalTime.of(0, 28));

		System.out.println("-------------defalut sorting  to id--------------");
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted()
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------------sort by name in asc--------------");
		Comparator<GameDTO> name = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(name)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------------sort by name in desc----------");
		Comparator<GameDTO> name2 = (t1, t2) -> t2.getName().compareTo(t1.getName());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(name2)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("------------------sort by points in asc---------------");
		Comparator<GameDTO> point = (t1, t2) -> Integer.compare(t1.getPoint(), t2.getPoint());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(point)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("------------------sort by points in desc---------------");
		Comparator<GameDTO> point2 = (t1, t2) -> Integer.compare(t2.getPoint(), t1.getPoint());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(point2)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-------------sort by event date in asc---------------");
		Comparator<GameDTO> event = (t1, t2) -> t1.getEventDate().compareTo(t2.getEventDate());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(event)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-------------sort by event date in desc---------------");
		Comparator<GameDTO> event2 = (t1, t2) -> t2.getEventDate().compareTo(t1.getEventDate());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(event2)
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-------------sort by name and  points in asc-------------");
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(name.thenComparing(point))
				.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("--------------sort by name ,points and event date in asc---------");
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(name.thenComparing(point).thenComparing(event)).forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("--------------sort by duration, eventdate and Id in  desc----------");
		Comparator<GameDTO> dura = (t1, t2) -> t2.getDuration().compareTo(t1.getDuration());
		Comparator<GameDTO> id = (t1, t2) -> Integer.compare(t2.getId(), t1.getId());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(dura.thenComparing(event2).thenComparing(id)).forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------collect duration in desc-------------");
		Comparator<GameDTO> dura2 = (t1, t2) -> t2.getDuration().compareTo(t1.getDuration());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(dura2)
				.forEach(g -> System.out.println(g.getDuration()));
		System.out.println();

		System.out.println("------------collect only game names--------------");
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted()
				.forEach(g -> System.out.println(g.getName()));
		System.out.println();

		System.out.println("---------collect only winners and sort in desc---------------");
		Comparator<GameDTO> winner = (t1, t2) -> t2.getWinner().compareTo(t1.getWinner());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(winner)
				.forEach(g -> System.out.println(g.getWinner()));
		System.out.println();

		System.out.println("------------collect only runner up --------------");
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted()
				.forEach(g -> System.out.println(g.getRunnerUp()));
		System.out.println();

		System.out.println("-----------find game by name-------------");

		Collection<GameDTO> game = new ArrayList<GameDTO>();
		game.add(dto);
		game.add(dto2);
		game.add(dto3);
		game.add(dto4);
		game.add(dto5);
		game.add(dto6);
		game.add(dto7);
		game.add(dto8);
		game.add(dto9);
		game.add(dto10);

		game.stream().filter(gam -> gam.getName().contains("Football")).forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("------------find game by eventDate-----------");
		Collection<String> name3 = new ArrayList<String>();

		game.stream().filter(g -> g.getEventDate().equals(LocalDate.of(2023, 8, 8)))
				.forEach(e -> name3.add(e.getName()));
		name3.forEach(g -> System.out.println(g));
		System.out.println();

		System.out.println("-----------find winner by game--------");
		game.stream().filter(gam -> gam.getName().contains("Cricket")).forEach(g -> System.out.println(g.getWinner()));
		System.out.println();

		System.out.println("-------- find points by game-----------");
		game.stream().filter(gam -> gam.getName().contains("Kabbadi")).forEach(g -> System.out.println(g.getPoint()));
		System.out.println();
	}

}
