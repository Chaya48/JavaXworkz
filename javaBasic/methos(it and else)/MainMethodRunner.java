class MainMethodRunner{
	public static void main(String[] vvalves){
		System.out.println("invoking mainMethod in cake");
		String name="Black Forest cake";
		Cake.tasty(name);
		String type="chocolate";
		String bakeryName="Puttu bakery";
		float price=40;
		Cake.tasty(price,bakeryName);
		int noOfPieces=12;
		Cake.tasty(noOfPieces,type);
		String ocassion="Birthday";
		Cake.perpose(ocassion);
		System.out.println("\n");
		
		System.out.println("invoking mainMethod in Camera");
		String location="hassan";
		Camera.click(location);
		double date=11062023;
		String cameraMan="Ravi";
		Camera.click(date,cameraMan);
		int howManyPeolple=3;
		Camera.click(howManyPeolple);
		short resolution=960;
		Camera.click(resolution);
		float clarity=36.864f;
		Camera.click(clarity);
		System.out.println("\n");
		
		System.out.println("invoking mainMethod in Fridge");
		String vegetable="tamoto";
		int egg=8;
		String chikan="Chikan";
		String fruit="apple";
		int water=2;
		float milk=1.5f;
		int curd=1;
		String meats="mutton";
		double juice=2.5d;
		String iceCream="vanilla ice cream";
		Fridge.store(vegetable);
		Fridge.store(egg,chikan);
		Fridge.store(fruit,water);
		Fridge.store(milk,curd,meats);
		Fridge.store(juice,iceCream);
		System.out.println("\n");
		
		System.out.println("invoking mainMethod in Baker");
		String foodName="sweet";
		int noOfPeople=4;
		Baker.cooking(foodName,noOfPeople);
		String workingFor="sale";
		short exp=2;
		Baker.cooking(workingFor,exp);
		float duration=2.5f;
		int assistance=3;
		Baker.cooking(duration,assistance);
	}
}