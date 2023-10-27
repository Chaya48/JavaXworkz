package com.xworkz.collectoin.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModel {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();
		collection.add("Dell XPS 13");
		collection.add("HP Spectre x360");
		collection.add("Lenovo ThinkPad X1 Carbon");
		collection.add("Apple MacBook Air");
		collection.add("Asus ZenBook 14");
		collection.add("Acer Predator Helios 300");
		collection.add("Microsoft Surface Laptop 4");
		collection.add("MSI GS66 Stealth");
		collection.add("Razer Blade 15");
		collection.add("LG Gram 17");
		collection.add("Google Pixelbook Go");
		collection.add("Huawei MateBook X Pro");
		collection.add("Alienware m15");
		collection.add("Lenovo Legion Y740");
		collection.add("HP Envy x360");
		collection.add("Dell Inspiron 14");
		collection.add("Asus ROG Zephyrus G14");
		collection.add("Acer Swift 3");
		collection.add("Microsoft Surface Book 3");
		collection.add("Lenovo Yoga C940");
		collection.add("Apple MacBook Pro");
		collection.add("Asus VivoBook S15");
		collection.add("MSI Prestige 14");
		collection.add("LG Gram 14");
		collection.add("Dell G3 15");
		collection.add("HP Pavilion x360");
		collection.add("Lenovo IdeaPad 3");
		collection.add("Acer Aspire 5");
		collection.add("Microsoft Surface Pro 7");
		collection.add("Razer Blade Stealth 13");
		collection.add("Asus ROG Strix G15");
		collection.add("Alienware Area-51m");
		collection.add("HP Omen 15");
		collection.add("Lenovo Legion 5");
		collection.add("Dell Latitude 7410");
		collection.add("MSI Creator Z16");
		collection.add("Acer Predator Triton 500");
		collection.add("Asus ROG Flow Z13");
		collection.add("LG Gram 16");
		collection.add("Microsoft Surface Go 3");
		collection.add("Huawei MateBook 14");
		collection.add("Google Pixelbook");
		collection.add("Apple MacBook");
		collection.add("Lenovo Yoga 9i");
		collection.add("HP EliteBook x360");
		collection.add("Dell Precision 5550");
		collection.add("Asus ZenBook Pro Duo");
		collection.add("MSI GT76 Titan");
		collection.add("Razer Blade Pro 17");
		collection.add("Alienware x15");
		System.out.println("Total laptop models is " + collection.size());
		Iterator<String> itra = collection.iterator();
		while (itra.hasNext()) {
			String models = itra.next();
			System.out.println("Laptop model is :" + models);
		}

	}

}
