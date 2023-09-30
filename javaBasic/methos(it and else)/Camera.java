class Camera{
	static void click(String location){
		System.out.println("location is "+location);
		if(location!=null){
			System.out.println("location is valid");
		}
		else{
			System.err.println("location is in-valid");
			return;
		}
	}
	static void click(double date,String cameraMan){
		System.out.println(" date is "+date);
		System.out.println(" camera Man name is :"+cameraMan);
		if(date>=06112021){
			System.out.println("date is valid");
		}
		else{
			System.out.println("date is in-valid");
			return;
		}
		if(cameraMan!=null){
			System.out.println("cameraMan name is valid");
		}
		else{
			System.out.println(" cameraMan name is in-valid");
			return;
		}
	}
	static void click(int howManyPeople){
		System.out.println("how many people is there "+howManyPeople);
		if(howManyPeople>=1 && howManyPeople<=12){
			System.out.println("people number is valid");
		}
		else{
			System.out.println("people number is in-valid");
			return;
		}
	}
	static void click(short resolution){
	 System.out.println(" resolution is "+resolution);
	 if(resolution<=960){
		 System.out.println(" resolution is valid");
	 }
	 else{
		 System.out.println("resolution is in-valid");
		 return;
	 }
	}
	 static void click(float clarityInMP){
		 System.out.println("camera clarity In MP is "+clarityInMP);
		 if(clarityInMP>=0.019 && clarityInMP<=44.237){
			 System.out.println("clarity In MP is valid");
		 }
		 else{
			 System.out.println("clarity In MP is in-valid");
			 return;
		 }
	 }
}