class Brick{
	static String colour;
	static String shape;
    float price;
    int duration;
	
	Brick(float price,int duration){
		this.price=price;
		this.duration=duration;
		System.out.println("invoking instance constructor in Brick");
	}
	static{
		colour="red";
		shape="rectangle";
		System.out.println("invoking static constructor in Brick");
	}
	static void printStaticBrick(String colour,String shape){
		System.out.println("invoking printStaticBrick constructor in Brick");
		System.out.println(colour);
		System.out.println(shape);
		System.out.println("\n");
	}
	void printInstanceBrick(float price,int duration){
		System.out.println("invoking printInstanceBrick constructor in Brick ");
		System.out.println(price);
		System.out.println(duration);
	}
}