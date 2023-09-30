class Owen{
	static void function(String heating){
		System.out.println(" owen function is "+heating);
		if(heating!=null){
			System.out.println(" heating is valid");
		}
		else{
			System.out.println(" heating is in-valid");
			return;
		}
	}
	static void function(int duration){
		System.out.println(" duration in mints "+duration);
	
	if(duration>=15 && duration<=30){
		System.out.println(" duration time is valid");
	}
	else{
		System.out.println(" duration time is in-valid");
		return;
	}
	}
	static void function(float price){
		System.out.println(" owen price is "+price);
		if(price>5890f){
			System.out.println("price is valid");
		}
		else{
			System.out.println(" price is in-valid");
		}
	}
}
