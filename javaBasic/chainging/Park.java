class Park{
	String name;
	String types;
	int numberOfPeople;
	int numberOftree;
	String games;
	float entryPrice;
	float dimenstion;
	double openTime;
	double closeTime;
	
	Park(){
		System.out.println("invoking no-args construcctor in Park");
	}
	Park(String name){
		this.name=name;
		System.out.println("invoking String construcctor in Park");
	}
	Park(String name,String types){
		this(name);
		this.types=types;
		System.out.println("invoking String,String construcctor in Park");
	}
	Park(String name,String types, int numberOfPeople){
		this(name,types);
		this.numberOfPeople=numberOfPeople;
		System.out.println("invoking String,String,int construcctor in Park");
	}
	Park(String name,String types, int numberOfPeople,int numberOftree){
		this(name,types,numberOfPeople);
		this.numberOftree=numberOftree;
		System.out.println("invoking String,String,int,int  construcctor in Park");
	}
	Park(String name,String types, int numberOfPeople,int numberOftree,String games){
		this(name,types,numberOfPeople,numberOftree);
		this.games=games;
		System.out.println("invoking String,String,int,int,String construcctor in Park");
	}
	Park(String name,String types, int numberOfPeople,int numberOftree,String games,float entryPrice){
		this(name,types,numberOfPeople,numberOftree,games);
		this.entryPrice=entryPrice;
		System.out.println("invoking String,String,int,int,String,float construcctor in Park");
	}
	Park(String name,String types, int numberOfPeople,int numberOftree,String games,float entryPrice,float dimenstion){
		this(name,types,numberOfPeople,numberOftree,games,entryPrice);
		this.dimenstion=dimenstion;
		System.out.println("invoking String,String,int,int,String,float,float construcctor in Park");
	}
	Park(String name,String types, int numberOfPeople,int numberOftree,String games,float entryPrice,float dimenstion,double openTime){
		this(name,types,numberOfPeople,numberOftree,games,entryPrice,dimenstion);
		this.openTime=openTime;
		System.out.println("invoking String,String,int,int,String,float,float,double construcctor in Park");
	}
	Park(String name,String types, int numberOfPeople,int numberOftree,String games,float entryPrice,float dimenstion,double openTime,double closeTime){
		this(name,types,numberOfPeople,numberOftree,games,entryPrice,dimenstion,openTime);
		this.closeTime=closeTime;
		System.out.println("invoking String,String,int,int,String,float,float,double,double construcctor in Park");
	}
}