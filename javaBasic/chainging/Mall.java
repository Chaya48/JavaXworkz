class Mall{
	
	String type;
	String largestMall;
	int numberOfFoodCourt;
	int numberOfClothShop;
	int numberOfgameShop;
	int workers;
	long peapleComming;
	
	Mall(){
		System.out.println("'invoking no-args constructor in Mall");
	}
	Mall(String type){
		this.type=type;
		System.out.println("invoking int constructor in Mall");
	}
	Mall(String type,String largestMall){
		this(type);
		this.largestMall=largestMall;
		System.out.println("invoking int,String constructor in Mall");
	}
	Mall(String type,String largestMall,int numberOfFoodCourt){
		this(type,largestMall);
		this.numberOfFoodCourt=numberOfFoodCourt;
		System.out.println("invoking int,String,int constructor in Mall");
	}
	Mall(String type,String largestMall,int numberOfFoodCourt,int numberOfClothShop){
		this(type,largestMall,numberOfFoodCourt);
		this.numberOfClothShop=numberOfClothShop;
		System.out.println("invoking int,String,int,int constructor in Mall");
	}
	Mall(String type,String largestMall,int numberOfFoodCourt,int numberOfClothShop,int numberOfgameShop){
		this(type,largestMall,numberOfFoodCourt,numberOfClothShop);
		this.numberOfgameShop=numberOfgameShop;
		System.out.println("invoking int,String,int,int,int constructor in Mall");
	}
	Mall(String type,String largestMall,int numberOfFoodCourt,int numberOfClothShop,int numberOfgameShop,int workers){
		this(type,largestMall,numberOfFoodCourt,numberOfClothShop,numberOfgameShop);
		this.workers=workers;
		System.out.println("invoking int,String,int,int,int,int constructor in Mall");
	}
	Mall(String type,String largestMall,int numberOfFoodCourt,int numberOfClothShop,int numberOfgameShop,int workers,long peapleComming){
		this(type,largestMall,numberOfFoodCourt,numberOfClothShop,numberOfgameShop,workers);
		this.peapleComming=peapleComming;
		System.out.println("invoking int,String,int,int,int,int,long constructor in Mall");
	}
}