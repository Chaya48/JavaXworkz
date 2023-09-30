class Resume{
	static void format()
	{
		System.out.println(" invoking resume format");
	}
	static void format(String type)
	{
		System.out.println(" resume format type:"+ type);
	}
	static void format(String type, int pages)
	{
		System.out.println(" resume format type:"+type);
		System.out.println(" resume format pages:"+pages);
	}
	static void clear()
	{
		System.out.println(" resume format is clear");
	}
	static void delete()
	{
		System.out.println(" resume format delete");
	}
}