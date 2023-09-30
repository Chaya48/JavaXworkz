class Wallet{
	
	String colour;
	float price;
	String closureType;
	
	Wallet()
	{
		System.out.println("invoking no-args constructor");
		System.out.println(this.colour);
		System.out.println(this.price);
		System.out.println(this.closureType);
		System.out.println("\n");
		this.colour="black";
		this.price=549;
		this.closureType="Button";
	}
	
	Wallet(String colour, float price, String closureType)
	{
		System.out.println("invoking parameter constructor");
		this.colour=colour;
		this.price=price;
		this.closureType=closureType;
	}
}