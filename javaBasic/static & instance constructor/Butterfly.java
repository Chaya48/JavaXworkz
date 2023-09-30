class Butterfly{
	static String colour;
	static String type;
	int speed;
	int noOfButterfly;
	
	Butterfly(int speed,int noOfButterfly){
		this.speed=speed;
		this.noOfButterfly=noOfButterfly;
		System.out.println("invoking instance constructor in Butterfly");
	}
	static{
		colour="blue";
		type="monarch";
		System.out.println("invoking static constructor in Butterfly");
	}
	static void printStaticButterfly(String colour,String type){
		System.out.println("invoking printstatic constructor in Butterfly");
		System.out.println(colour);
		System.out.println(type);
		System.out.println("\n");
	}
	void printInstanceButterfly(int speed,int noOfButterfly){
		System.out.println("invoking printinstance constructor in Butterfly");
		System.out.println(speed);
		System.out.println(noOfButterfly);
		System.out.println("\n");
	}
}