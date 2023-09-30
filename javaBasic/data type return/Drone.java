class Drone{
	static double getDistanceByFlight(String operator, String event){
			if("chaya"==operator && "wedding"==event){
				System.out.println("operator name and event is valid");
				return 2.5;
			}
		else{
			System.out.println("operator name and event is in-valid");
		}
		return 0;
	}
	static double getPricePerEvent(String eventName){
		if("Birthday"==eventName){
			System.out.println("event Name is valid");
			return 10000;
		}
		System.out.println("event name is in-valid");
		return 0;
		
	}
	static int getDistanceByEvent(String eventName, String refPerson){
		if("wedding"==eventName && "chaya"==refPerson){
			System.out.println("eventName and refPerson name is valid");
			return 3;
		}
		else{
			System.out.println("eventName and refPerson name is in-valid");
			return 0;
		}
	}
} 