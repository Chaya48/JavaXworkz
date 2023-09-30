class Carpenter{
	static void fixing(String door)
	{
		System.out.println("invoking carpenter is fixing "+door);
	}
	static void fixing(String door,float cost, int number)
	{
	    System.out.println("carpenter is fixing "+door);
		System.out.println("carpenter is fixing price: "+cost);
		System.out.println("carpenter is fixed numbers "+number);
	}
	static void polishing(String wood)
	{
	System.out.println("carpenter is polishing the "+wood);
	}
	static void polishing(int number)
	{
		System.out.println(" carpenter is polishing the numberof wood: "+ number);
	}

	static void cut(int number)
	{
	System.out.println("carpenter is cut the number of wood  is"+number);
	}
	static void shape(String round)
	{
	System.out.println("carpenter give shapes for wood  "+round);
	}
	static void price(float cost)
	{
	System.out.println("wood price "+cost);
	}
	static void refitting(String cot,int number)
	{
	  System.out.println(" carpenter refitting the "+cot);
	  System.out.println(" carpenter refitting the number of cot is:"+number);
	}
	static void renovating(float cost)
	{
		System.out.println(" renovating in carpenter taking price "+cost);
	}
	static void installingFloors(int number)
	{
		System.out.println(" carpenter is installing the Floors "+number);
	}
	static void buildingSetFor(String film)
	{
		System.out.println(" carpenter is building Set For "+film);
	}
	static void finishing(float cost)
	{
		System.out.println(" carpenter is finishing price "+cost);
	}
	
}