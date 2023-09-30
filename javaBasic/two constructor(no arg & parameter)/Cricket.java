class Cricket{
	
	int playerNumbers;
	String equipment;
	String venue;
	
	Cricket()
	{
		System.out.println("invoking no-args constructor");
		System.out.println(this.playerNumbers);
		System.out.println(this.equipment);
		System.out.println(this.venue);
		System.out.println("\n");
		this.playerNumbers=11;
		this.equipment="Ball,Bat,Wicket";
		this.venue="Cricket field";
	}
	Cricket(int playerNumbers,String equipment,String venue)
	{
		System.out.println("invoking parameter constructor");
		this.playerNumbers=playerNumbers;
		this.equipment=equipment;
		this.venue=venue;
	}
}