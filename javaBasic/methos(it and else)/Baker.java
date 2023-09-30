class Baker{
	static void cooking(String foodItem, int noOfPeople){
		System.out.println(" baker is cooking the foodItem is "+foodItem);
		System.out.println(" number of people are cooking "+noOfPeople);
		if(foodItem!=null){
			System.out.println("foodItem is valid");
		}
		else{
			System.out.println("foodItem is in-valid");
			return;
		}
		if(noOfPeople>=2){
			System.out.println("People number is valid ");
		}
		else{
			System.out.println("people number is in-valid");
			return;
		}
	}
	static void cooking(String workingFor,short exp){
		System.out.println("baker is working For "+workingFor);
		System.out.println("working experince is "+exp);
		if(workingFor!=null){
			System.out.println(" working is valid");
		}
		else{
			System.out.println(" working is in-valid");
			return;
		}
		if(exp>1){
			System.out.println(" experince is valid");
		}
		else{
			System.out.println(" experince is in-valid");
			return;
		}
	}
	static void cooking(float duration, int assitance){
		System.out.println(" duration for cooking is "+duration);
		System.out.println(" assitance number is "+assitance);
	if(duration>1.5){
		System.out.println(" duration is valid");
		}
		else{
			System.out.println("duration is in-valid");
			return;
		}
		if(assitance>1){
			System.out.println("assitance number is valid");
		}
		else{
			System.out.println("assitance number is in-valid");
			return;
		}
	}
}