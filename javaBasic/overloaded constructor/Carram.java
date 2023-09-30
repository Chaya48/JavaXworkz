class Carram{
	int numberOfPlayers;
	String genres;
	String equipment;
	String firstInventedBy;
	float price;
	
	
	Carram()
	{
		System.out.println("invoking no-args construstor");
		System.out.println(this.numberOfPlayers);
		System.out.println(this.genres);
		System.out.println(this.equipment);
		System.out.println(this.firstInventedBy);
		System.out.println(this.price);
		System.out.println("\n");
	}
	Carram(int numberOfPlayers){
		System.out.println("invoking int construstor");
		this.numberOfPlayers=numberOfPlayers;
	}
	Carram(int numberOfPlayers, String genres){
		System.out.println("invoking int, String construstor");
		this.numberOfPlayers=numberOfPlayers;
		this.genres=genres;
	}
	Carram(int numberOfPlayers,String genres,String equipment){
		System.out.println("invoking int, String,String construstor");
		this.numberOfPlayers=numberOfPlayers;
		this.genres=genres;
		this.equipment=equipment;
	}
	Carram(int numberOfPlayers,String genres,String equipment,String firstInventedBy){
		System.out.println("invoking int,String,String,String construstor");
		this.numberOfPlayers=numberOfPlayers;
		this.genres=genres;
		this.equipment=equipment;
		this.firstInventedBy=firstInventedBy;
	}
	Carram(int numberOfPlayers,String genres,String equipment,String firstInventedBy,float price){
		System.out.println("invoking int,String,String,String,float construstor");
		this.numberOfPlayers=numberOfPlayers;
		this.genres=genres;
		this.equipment=equipment;
		this.firstInventedBy=firstInventedBy;
		this.price=price;
	}
}