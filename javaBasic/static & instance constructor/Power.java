class Power{
	static int frequency;
	static float efficency;
	int voltage;
	int current;
	
	Power(int voltage,int current){
		this.voltage=voltage;
		this.current=current;
		System.out.println("invoking Instance constructor in Power");
	}
	static{
		frequency=50;
		efficency=88;
		System.out.println("invoking static constructor in power");
	}
	static void printStaticPower(int frequency,float efficency){
		System.out.println("invoking printStatic constructor in power");
		System.out.println(frequency);
		System.out.println(efficency);
		System.out.println("\n");
	}
	void printInstancePower(int voltage,int current){
		System.out.println(voltage);
		System.out.println(current);
	}
}