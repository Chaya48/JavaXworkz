class Runner{
	public static void main(String[] args){
		System.out.println("invoking main in HelmetRunner");
		System.out.println("\n");
		
		Helmet helmet=new Helmet(1600,99);
		System.out.println("price is"+helmet.price);
		System.out.println("mass is"+helmet.mass);
		System.out.println("\n");

		
		Helmet.printStatic("Thh","dome");
		helmet.printInstance(2000,99);
	}
}