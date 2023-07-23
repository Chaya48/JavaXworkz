class Helmet{
	
	static String brand;
	static String type;
	float price;
	int mass;
	
	Helmet(float price,int mass){
		this.price=price;
		this.mass=mass;
		System.out.println("invoking instancce constructor in Helmet");
	}
	static {
		brand="Shoei";
		type="dome";
		System.out.println("invoking static constructor in Helmet");
		System.out.println("\n");
	}
	static void printStatic(String brand,String type)
	{
		System.out.println("invoking printStatic in Helmet");
		System.out.println(brand);
		System.out.println(type);
		System.out.println("\n");
	}
	void printInstance(float price,int mass)
	{
		System.out.println("invoking printInstance inn Helmet");
		System.out.println(price);
		System.out.println(mass);
		System.out.println("\n");
	}
}