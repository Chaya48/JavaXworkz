class Kulfi{
	static void tasty(String flavour){
		System.out.println(" kulfi flavour is "+flavour);
	if(flavour!=null){
		System.out.println(" flavour is valid");
	}
	else{
		System.out.println(" flavour is in-valid");
		return;
	}
}
	static void tasty(int number){
		System.out.println( "number is "+number);
		if(number>=2 && number<20){
			System.out.println(" number is valid ");
		}
		else{
			System.out.println("number is in-valid");
			return;
		}
	}
	static void tasty(float rate){
		System.out.println("rate of kulfi is "+rate);
	if(rate>=5 && cost<=200){ 
		System.out.println("rate is valid");
	}
	else{
		System.out.println("rate is in-valid");
		return;
	}
	}
	}