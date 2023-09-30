class BadmintonMainMethod{
	public static void main(String[] valves){
		System.out.println("invoking main in BadmintonMainMethod");
		
		Badminton badminton=new Badminton();
		System.out.println(badminton.sport);
		System.out.println(badminton.TeamMembers);
		System.out.println(badminton.present);
		System.out.println(badminton.firstPlayed);
		System.out.println(badminton.equipment);
		System.out.println("\n");
		
		badminton.sport="racquet sport";
		badminton.TeamMembers=1;
        badminton.present=1981;
        badminton.firstPlayed="Badminton House";
        badminton.equipment="Shuttlecock";

        System.out.println("sport is :"+badminton.sport);
        System.out.println("team member is :"+badminton.TeamMembers);
        System.out.println("presented in :"+badminton.present);
        System.out.println("firstPlayed in :"+badminton.firstPlayed);
        System.out.println("equipment is :"+badminton.equipment);
        System.out.println("===============================================");

        Badminton badminton1=new Badminton();
		System.out.println(badminton1.sport);
		System.out.println(badminton1.TeamMembers);
		System.out.println(badminton1.present);
		System.out.println(badminton1.firstPlayed);
		System.out.println(badminton1.equipment);
		System.out.println("\n");
		
		badminton1.sport="racquetSport";
		badminton1.TeamMembers=2;
        badminton1.present=1981;
        badminton1.firstPlayed="Badminton House";
        badminton1.equipment="racquet";
		
		 System.out.println("sport is :"+badminton1.sport);
        System.out.println("team member is :"+badminton1.TeamMembers);
        System.out.println("presented in :"+badminton1.present);
        System.out.println("firstPlayed in :"+badminton1.firstPlayed);
        System.out.println("equipment is :"+badminton1.equipment);
	}
}