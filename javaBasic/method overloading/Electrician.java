class Electrician{
	static void installing(String light)
	{
		System.out.println("Electrician is installing the "+light);
	}
	static void installing(String fan, int number)
	{
		System.out.println("Electrician is installing the "+fan);
		System.out.println("Electrician is installing the points is "+number);
	}
	static void testing(String circuit)
	{
		System.out.println("Electrician is testing the "+circuit);
	}
	static void testing(int number,float cost)
	{
		System.out.println("Electrician  is testingthe points "+number);
		System.out.println("Electrician is takeing price for testing "+cost);
	}
	static void fitting(String refrigerators)
	{
	System.out.println("Electrician is fitting the "+refrigerators);
	}
	static void repairing(float cost)
	{
		System.out.println("Electrician is taking repairing price is "+cost);
	}
	static void reWiring(String building)
	{
		System.out.println("Electrician is rewiring the "+building);
	}
	static void maintence(float cost)
	{
		System.out.println("Electrician is taking maintence cost is "+cost);
	}
	static void estimating(String home,int points)
	{
		System.out.println("Electrician is estimating the "+home);
		System.out.println("Electrician is estimating the points number "+points);
	}
	static void building(String device)
	{
		System.out.println("Electrician  is building the "+device);
	}
	static void prevent(String hazards)
	{
		System.out.println("Electrician is prevent the "+hazards);
	}
	static void newWiring(int points)
	{
		System.out.println("Electrician is newWiring the "+points);
	}
}