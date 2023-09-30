class GoldSmith{
	static void polishing(String category){
		System.out.println("polishing category is "+category);
		if(category!=null){
			System.out.println("category is valid ");
		}
		else{
			System.out.println(" category is in-valid");
		}
	}
	static void polishing(short no){
		System.out.println("number of polishing is "+no);
		if(no>20){
			System.out.println(" number is valid");
		}
		else{
			System.out.println(" number is in-valid");
			return;
		}
	}
	static void polishing(double cost){
		System.out.println("cost of the polishing is "+cost);
		if(cost>2000){
			System.out.println(" cost is valid");
		}
		else{
			System.out.println(" cost is in-valid");
			return;
		}
	}
}