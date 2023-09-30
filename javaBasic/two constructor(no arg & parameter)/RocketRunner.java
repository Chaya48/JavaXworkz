class RocketRunner{
	public static void main(String[] valves){
		System.out.println("invoking main in RocketRunner");
		System.out.println("\n");
		
		Rocket rocket=new Rocket();
		System.out.println("Rocket name is :"+rocket.name);
		System.out.println("mission Type is :"+rocket.missionType);
		System.out.println("operator :"+rocket.operator);
		System.out.println("launchMass is :"+rocket.launchMass);
		System.out.println("\n");
		
		Rocket rocket1=new Rocket("LVM3-M4","Orbiter,Lander,Rover","ISRO",3850);
		System.out.println("rocket name is :"+rocket1.name);
		System.out.println("mission Type is :"+rocket1.missionType);
		System.out.println("operator :"+rocket1.operator);
		System.out.println("launchMass is :"+rocket1.launchMass);
	}
}