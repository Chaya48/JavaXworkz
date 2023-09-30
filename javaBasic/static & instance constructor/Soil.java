class Soil{
	static String colour;
	static float pH;
	float temperature;
	float density;
	
	Soil(float temperature,float  density){
		this.temperature=temperature;
		this.density=density;
		System.out.println("invoking instance constructor in Soil");
	}
	static{
		colour="red";
		pH=7.5f;
		System.out.println("invoking static constructor in Soil");
	}
	static void printStaticSoil(String colour,float pH){
		System.out.println("invoking printStatic constructor in Soil");
		System.out.println(colour);
		System.out.println(pH);
	}
	void printInstanceSoil(float temperature,float density){
		System.out.println("invoking printInstance constructor in Soil");
	    System.out.println(temperature);
	    System.out.println(density);
	    System.out.println("\n");
	}
	}
