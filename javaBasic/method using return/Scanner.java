class Scanner{
	static void func(String type){
		System.out.println(" scanner type "+type);
		if(type!=null){
			System.out.println(" type is valid");
		}
		else{
			System.out.println(" type is in-valid");
			return;
		}
	}
	static void func(int number){
		System.out.println(" number of scaners is "+number);
		
		if(number>2){
			System.out.println(" number is valid");
		}
		else{
			System.out.println(" number is in-valid");
			return;
		}
	}
	static void func(float price){
		System.out.println(" price of scaner is "+price);
		if(price>1500){
			System.out.println(" price is valid");
		}
		else{
			System.out.println(" price is in-valid");
			return;
		}
	}
}