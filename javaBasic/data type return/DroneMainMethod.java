class DroneMainMethod{
	public static void main(String[] values){
		System.out.println(" invoking main in DroneMainMethod");
		double distance=Drone.getDistanceByFlight("chaya","wedding");
		System.out.println("distance is :"+distance);
	     distance=Drone.getDistanceByFlight("jeevitha","wedding");
		System.out.println("distance is :"+distance);
		System.out.println("\n");
		
		double price=Drone.getPricePerEvent("Birthday");
		System.out.println("price  is :"+price);
		price=Drone.getPricePerEvent("birthdau");
		System.out.println("price is :+price"+price);
		System.out.println("\n");

		int dis=Drone.getDistanceByEvent("wedding","chaya");
		System.out.println("distance is :"+dis);
		dis=Drone.getDistanceByEvent("birthday","jeevitha");
		System.out.println("distance is :"+dis);
		
	}
}