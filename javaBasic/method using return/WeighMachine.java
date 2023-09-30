class WeighMachine{
	static void function(String calculate){
		System.out.println(" WeighMachine function is calculate the "+calculate);
	if(calculate!=null){
		System.out.println(" function is valid");
	}
	else{
		System.out.println(" function is in-valid");
		return;
	}
}
	static void function(int weight){
		System.out.println( "weight calculate is "+weight);
		if(weight<=200){
			System.out.println(" weight is valid ");
		}
		else{
			System.out.println("weight is in-valid");
			return;
		}
	}
	static void function(float cost){
		System.out.println("cost of the weighMachine is "+cost);
	if(cost>=3200){
		System.out.println("cost is valid");
	}
	else{
		System.out.println("cost is in-valid");
		return;
	}
	}
}