class DoorBellRunner{
	public static void main(String[] args){
		System.out.println("invoking main in DoorBellRunner");
		
		DoorBell doorBell=new DoorBell();
		System.out.println(doorBell.manufacturer);
		System.out.println(doorBell.countryOfOrigin);
		System.out.println(doorBell.modelName);
        System.out.println(doorBell.weight);
		System.out.println(doorBell.type);
		System.out.println(doorBell.range);
		System.out.println(doorBell.price);
		System.out.println("\n");
		
		DoorBell doorBell1=new DoorBell("Robotek LLP");
		System.out.println(doorBell1.manufacturer);
		System.out.println(doorBell1.countryOfOrigin);
		System.out.println(doorBell1.modelName);
        System.out.println(doorBell1.weight);
		System.out.println(doorBell1.type);
		System.out.println(doorBell1.range);
		System.out.println(doorBell1.price);
		System.out.println("\n");
		
		DoorBell doorBell2=new DoorBell("Robotek LLP","India");
		System.out.println(doorBell2.manufacturer);
		System.out.println(doorBell2.countryOfOrigin);
		System.out.println(doorBell2.modelName);
        System.out.println(doorBell2.weight);
		System.out.println(doorBell2.type);
		System.out.println(doorBell2.range);
		System.out.println(doorBell2.price);
		System.out.println("\n");
		
		DoorBell doorBell3=new DoorBell("Robotek LLP","India","U400B");
		System.out.println(doorBell3.manufacturer);
		System.out.println(doorBell3.countryOfOrigin);
		System.out.println(doorBell3.modelName);
        System.out.println(doorBell3.weight);
		System.out.println(doorBell3.type);
		System.out.println(doorBell3.range);
		System.out.println(doorBell3.price);
		System.out.println("\n");
		
		DoorBell doorBell4=new DoorBell("Robotek LLP","India","U400B",110);
		System.out.println(doorBell4.manufacturer);
		System.out.println(doorBell4.countryOfOrigin);
		System.out.println(doorBell4.modelName);
        System.out.println(doorBell4.weight);
		System.out.println(doorBell4.type);
		System.out.println(doorBell4.range);
		System.out.println(doorBell4.price);
		System.out.println("\n");
		
		DoorBell doorBell5=new DoorBell("Robotek LLP","India","U400B",110,"wireless");
		System.out.println(doorBell5.manufacturer);
		System.out.println(doorBell5.countryOfOrigin);
		System.out.println(doorBell5.modelName);
        System.out.println(doorBell5.weight);
		System.out.println(doorBell5.type);
		System.out.println(doorBell5.range);
		System.out.println(doorBell5.price);
		System.out.println("\n");
		
		DoorBell doorBell6=new DoorBell("Robotek LLP","India","U400B",110,"wireless",25);
		System.out.println(doorBell6.manufacturer);
		System.out.println(doorBell6.countryOfOrigin);
		System.out.println(doorBell6.modelName);
        System.out.println(doorBell6.weight);
		System.out.println(doorBell6.type);
		System.out.println(doorBell6.range);
		System.out.println(doorBell6.price);
		System.out.println("\n");
		
		DoorBell doorBell7=new DoorBell("Robotek LLP","India","U400B",110,"wireless",25,849);
		System.out.println(doorBell7.manufacturer);
		System.out.println(doorBell7.countryOfOrigin);
		System.out.println(doorBell7.modelName);
        System.out.println(doorBell7.weight);
		System.out.println(doorBell7.type);
		System.out.println(doorBell7.range);
		System.out.println(doorBell7.price);
		System.out.println("\n");
		}
}