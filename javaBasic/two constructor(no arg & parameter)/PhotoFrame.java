class PhotoFrame{
	
	String colour;
	String shape;
	float price;
	
	PhotoFrame()
	{
		System.out.println("invoking no-args construcctor");
		System.out.println(this.colour);
		System.out.println(this.shape);
		System.out.println(this.price);
		this.colour="black";
		this.shape="square";
		this.price=1349;
	}
	
	PhotoFrame(String colour, String shape, float price)
	{
		System.out.println("invoking parameter construcctor");
		this.colour=colour;
		this.shape=shape;
		this.price=price;
	}
}