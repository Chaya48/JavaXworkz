class Job{
	static void apply()
	{
		System.out.println(" invoking apply in job");
	}
	static void apply(String personName,int exp)
	{
		System.out.println(" person Name in job:"+personName);
		System.out.println("person exp in job: "+exp);
	}
	static void apply(String name,int exp,String refName)
	{
		System.out.println(" name in job: "+name);
	    System.out.println(" exp in job: "+exp);
		System.out.println("refName in job: "+refName);
	}
	static void apply(int exp)
	{
		System.out.println(" exp in job apply"+exp);
	 
	}
	static void rejecctOffer()
	{
		System.out.println(" rejecctOffer in job");
	}
}