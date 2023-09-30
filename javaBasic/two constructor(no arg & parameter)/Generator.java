 class Generator{
	 
	 int wattage;
	 int voltage;
	 float weight;
	 
	 Generator(){
	 System.out.println("invoking no-arg constructor");
	 System.out.println(this.wattage);
	 System.out.println(this.voltage);
	 System.out.println(this.weight);
	 System.out.println("\n");
	 this.wattage=512;
	 this.voltage=120;
	 this.weight=13.3f;
	 }
	 
	 Generator(int wattage,int voltage, float weight)
	 {
		 System.out.println("invoking parameter constructor");
		 this.wattage=wattage;
		 this.voltage=voltage;
		 this.weight=weight;
	 }
 }