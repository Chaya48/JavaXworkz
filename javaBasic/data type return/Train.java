class Train{
	static String getTrainName(int trainNumber){
		System.out.println("invoking main in train");
		if(trainNumber>0){
		
		if(11013==trainNumber){
				return "Coimbatore Express";
			}
			if(11014==trainNumber){
				return "Lokmanya Express";
			}
			if(12134==trainNumber){
			   return "Mumbai Express";
			}
			if(22691==trainNumber){
				return "Rajdhani Express";
			}
		}
		else{
			System.out.println(" Train name is inValid");
		}
	
		return "not valid";
	}
	}
