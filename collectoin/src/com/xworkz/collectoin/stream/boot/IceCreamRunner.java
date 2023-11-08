package com.xworkz.collectoin.stream.boot;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collectoin.stream.dto.IceCreamDTO;

public class IceCreamRunner {

	public static void main(String[] args) {

		IceCreamDTO dto = new IceCreamDTO("Chocolate", "brown", 200, LocalDate.of(2023, 11, 6), "Cup");
		IceCreamDTO dto2 = new IceCreamDTO("Vanilla", "white", 150, LocalDate.of(2023, 11, 5), "cone");
		IceCreamDTO dto3 = new IceCreamDTO("Strawberry", "pink", 340, LocalDate.of(2023, 11, 4), "cone");
		IceCreamDTO dto4 = new IceCreamDTO("Butter pecan", "light-yellow", 150, LocalDate.of(2023, 11, 3), "Cup");
		IceCreamDTO dto5 = new IceCreamDTO("Pista", "light-green", 500, LocalDate.of(2023, 11, 2), "family pack");

		Stream.of(dto5, dto4, dto3, dto2, dto).sorted().forEach(i -> System.out.println(i));

		System.out.println();

		Comparator<IceCreamDTO> com = (t1, t2) -> t1.getFlavour().compareTo(t2.getFlavour());

		Stream.of(dto5, dto4, dto3, dto2, dto).sorted(com).forEach(i -> System.out.println(i));

		System.out.println();

		Comparator<IceCreamDTO> date = (t1, t2) -> t2.getManufDate().compareTo(t1.getManufDate());
		Stream.of(dto5, dto4, dto3, dto2, dto).sorted(date).forEach(i -> System.out.println(i));

		System.out.println();

		Comparator<IceCreamDTO> color = (t1, t2) -> t1.getColor().compareTo(t2.getColor());
		Stream.of(dto5, dto4, dto3, dto2, dto).sorted(color).forEach(i -> System.out.println(i));

		System.out.println();

		Comparator<IceCreamDTO> type = (t1, t2) -> t2.getType().compareTo(t1.getType());
		Stream.of(dto5, dto4, dto3, dto2, dto).sorted(type).forEach(i -> System.out.println(i));

		System.out.println();

		Comparator<IceCreamDTO> pri = (t1, t2) -> {
			if (t1.getPrice() == (t2.getPrice())) {
				t1.getManufDate().compareTo(t2.getManufDate());
			}
			return 0;
		};
		Stream.of(dto5, dto4, dto3, dto2, dto).sorted(pri).forEach(i -> System.out.println(i));

		System.out.println("then campare");

		Comparator<IceCreamDTO> priceCom = (t1, t2) -> Double.compare(t1.getPrice(), t2.getPrice());
		Comparator<IceCreamDTO> dateCom=(t1,t2) -> t1.getManufDate().compareTo(t2.getManufDate());
		
		Stream.of(dto5, dto4, dto3, dto2, dto).sorted(priceCom.thenComparing(dateCom)).forEach(i -> System.out.println(i));

	}

}
