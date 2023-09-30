class Soda{
	static void tasty(String flavour){
		System.out.println("Soda flavour is "+flavour);
	if(flavour!=null){
		System.out.println(" flavour is valid");
	}
	else{
		System.out.println(" flavour is in-valid");
		return;
	}
}
	static void tasty(int num){
		System.out.println( "number is "+num);
		if(num>=2){
			System.out.println(" number is valid ");
		}
		else{
			System.out.println("number is in-valid");
			return;
		}
	}
	static void tasty(float rate){
		System.out.println("rate of kulfi is "+rate);
	if(rate>=2){ 
		System.out.println("rate is valid");
	}
	else{
		System.out.println("rate is in-valid");
		return;
	}
	}
	}