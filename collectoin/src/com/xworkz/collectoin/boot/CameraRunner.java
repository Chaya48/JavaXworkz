package com.xworkz.collectoin.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collectoin.app.dto.CameraDTO;

public class CameraRunner {

	public static void main(String[] args) {

		CameraDTO camera = new CameraDTO(1, "sony", "DSCW810 ", 6741, LocalDate.of(2023, 10, 29));
		CameraDTO camera2 = new CameraDTO(2, "Fujifilm", "x-T300", 144999, LocalDate.of(2023, 9, 24));
		CameraDTO camera3 = new CameraDTO(3, "Canon", "FZ55", 366787, LocalDate.of(2023, 8, 21));
		CameraDTO camera4 = new CameraDTO(4, "leica", "MINILUX", 19756, LocalDate.of(2023, 6, 13));
		CameraDTO camera5 = new CameraDTO(5, "sigma", "fp L", 208098, LocalDate.of(2023, 4, 18));

		Collection<CameraDTO> cameraCollection = new ArrayList<CameraDTO>();
		cameraCollection.add(camera);
		cameraCollection.add(camera2);
		cameraCollection.add(camera3);
		cameraCollection.add(camera4);
		cameraCollection.add(camera5);

		System.out.println("total " + cameraCollection.size());
		Collection<String> models = new ArrayList<String>();

		cameraCollection.stream().filter(camer -> camer.getBrand().contains("Canon"))
				.forEach(cam -> System.out.println("contains canon :" + cam.getBrand()));

		cameraCollection.stream().filter(camer -> camer.getCost() > 40000).forEach(c -> models.add(c.getModel()));
		models.forEach(cam -> System.out.println("cost is above 40000 model names :" + cam));

		cameraCollection.stream().filter(camer -> camer.getCost() == 6741)
				.forEach(m -> System.out.println(m.getBrand()));

		cameraCollection.stream().filter(camer -> camer.getBrand().equals("sony")).map(cam -> cam.getCost())
				.forEach(p -> System.out.println(p));
	}

}
