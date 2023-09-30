class StadiumMainMethod{
	public static void main(String[] valves){
		System.out.println("invoking main in StadiumMainMethod");
		
		
		Stadium stadium=new Stadium();
		System.out.println(stadium.name);
		System.out.println(stadium.size);
		System.out.println(stadium.sports);
		System.out.println(stadium.players);
		System.out.println(stadium.attendingPeople);
		System.out.println("\n");
		
		stadium.name="chinnaswami Stadium";
		stadium.size=20;
		stadium.sports="cricket";
		stadium.players=500;
		stadium.attendingPeople=40000;
		
		System.out.println("name is :"+stadium.name);
		System.out.println("size is :"+stadium.size);
		System.out.println("sports is :"+stadium.sports);
		System.out.println("players number :"+stadium.players);
		System.out.println("attending People at once :"+stadium.attendingPeople);
		System.out.println("==========================");
		
		Stadium stadium1=new Stadium();
		
		System.out.println(stadium1.name);
		System.out.println(stadium1.size);
		System.out.println(stadium1.sports);
		System.out.println(stadium1.players);
		System.out.println(stadium1.attendingPeople);
		System.out.println("\n");
		
		stadium1.name="Ambedkar Stadium";
		stadium1.size=10;
		stadium1.sports="footbal";
		stadium1.players=50;
		stadium1.attendingPeople=15000;
		
		System.out.println("name is :"+stadium1.name);
		System.out.println("size is :"+stadium1.size);
		System.out.println("sports is :"+stadium1.sports);
		System.out.println("players number :"+stadium1.players);
		System.out.println("attending People at once :"+stadium1.attendingPeople);
	}
}