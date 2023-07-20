class CricketRunner{
	public static void main(String[] args){
		System.out.println("invoking main in CricketRunner");
		
		Cricket cricket=new Cricket();
		System.out.println("playerNumbers is :"+cricket.playerNumbers);
		System.out.println("equipment is :"+cricket.equipment);
		System.out.println("venue is :"+cricket.venue);
		System.out.println("\n");
		
		Cricket cricket1=new Cricket(11,"bat,ball,wicket","feild");
		System.out.println("playerNumbers is :"+cricket1.playerNumbers);
		System.out.println("equipment is :"+cricket1.equipment);
		System.out.println("venue is :"+cricket1.venue);
	}
}