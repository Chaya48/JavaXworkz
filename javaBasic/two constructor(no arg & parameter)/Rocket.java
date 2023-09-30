class Rocket{
	String name;
	String missionType;
	String operator;
	int launchMass;
	
	Rocket()
	{
		System.out.println("invoking no=arg constructor");
		System.out.println(this.name);
		System.out.println(this.missionType);
		System.out.println(this.operator);
		System.out.println(this.launchMass);
		System.out.println("\n");
		this.name="LVM3-M1";
		this.missionType="Lander, Rover, Propulsion module";
		this.operator="ISRO";
		this.launchMass=3900;
	}
	Rocket(String name,String missionType,String operator, int launchMass)
	{
		System.out.println("invoking parameter constructor");
		this.name=name;
		this.missionType=missionType;
		this.operator=operator;
		this.launchMass=launchMass;
	}
}