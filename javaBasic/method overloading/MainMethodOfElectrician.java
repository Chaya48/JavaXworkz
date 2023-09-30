class MainMethodOfElectrician{
	static void controlTheLight()
	{
		System.out.println(" Electrician is control The Light");
	}
	static void controlTheSystem()
	{
		System.out.println(" Electrician is control The System");
	}
	public static void main(String[] valves){
		Electrician.installing("light");
		Electrician.installing("fan",3);
		Electrician.testing("circuit");
		Electrician.testing(4,200f);
		Electrician.fitting("refrigerators");
		Electrician.repairing(356f);
		Electrician.reWiring("building");
		Electrician.maintence(466f);
		Electrician.estimating("home",12);
		Electrician.building("device");
		Electrician.prevent("hazards");
		Electrician.newWiring(9);
		controlTheLight();
		controlTheSystem();
	}
}