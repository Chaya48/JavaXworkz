class Fridge{
	static void store(String vegetable){
		System.out.println("fridge store the vegetable is  "+vegetable);
		if(vegetable!=null){
			System.out.println("store data is valid ");
		}
		else{
			System.out.println("store data is in-valid");
			return;
		}
	}
	static void store(int egg,String chikan){
		System.out.println("store egg number is "+egg);
		System.out.println(" storing item is "+chikan);
		if(egg>=2 && egg<=15){
			System.out.println("egg number is valid");
		}
		else{
			System.out.println("egg number is in-valid");
			return;
		}
		if(chikan!=null){
			System.out.println("item is valid");
		}
		else{
			System.out.println(" item is in-valid");
			return;
		}
	}
	static void store(String fruit,int water){
	System.out.println("store fruit is "+fruit);
	System.out.println("water quantity is "+water);
	if(fruit!=null){
		System.out.println(" fruit name is valid");
	}
	else{
		System.out.println(" fruit name is in-valid");
		return;
	}
	if(water>1){
		System.out.println(" water quantity is valid");
	}
	else{
		System.out.println("water quantity is in-valid");
		return;
	}
	}
	static void store(float milk,int  curd,String meats){
		System.out.println(" store meats is "+meats);
		System.out.println(" store milk quantity is "+milk);
		System.out.println(" store curd quantity is "+curd);
		if(milk>=0.5){
			System.out.println("milk quantity is valid");
		}
		else{
			System.out.println("milk quantity is in-valid");
		}
		if(curd>=0){
			System.out.println("curd quantity is valid");
		}
		else{
			System.out.println("curd quantity is in-valid");
			return;
		}
		if(meats!=null){
			System.out.println("meats is valid");
		}
		else{
			System.out.println("meats is in-valid");
			return;
		}
	}
	static void store(double juice,String iceCream){
		System.out.println("store iceCream is "+iceCream);
		System.out.println("store juice quantity is "+juice);
		if(juice>=1.5){
			System.out.println("juice quantity is valid");
		}
		else{
			System.out.println("juice quantity is in-valid");
		}
		if(iceCream!=null){
			System.out.println(" iceCream is valid");
		}
		else{
			System.out.println(" iceCream is in-valid");
		}
	}
}