class PersonReturn{
	static int getAgeByName(String name){
		System.out.println("invoking main in age by name");
	if(name!=null){
			if("chaya"==name){
				return 21;
			}
			if("Ravi"==name){
				return 23;
			}
			if("Surya"==name){
				return 28;
			}
			if("Jeevitha"==name){
				return 22;
			}
			if("pooja"==name){
				return 20;
			}
			if("anupama"==name){
				return 24;
			}
			if("sushma"==name){
				return 25;
			}
			if("usha"==name){
				return 26;
			}
			if("bhoomi"==name){
				return 27;
			}
			if("anusha"==name){
				return 19;
			}
	}
		else{
			System.out.println(" name is invalid");
		}
		return 0;
		}
	
	static String getEmailByName(String name){
		System.out.println("invoking main in email by name");
		if(name!=null){
		
			if("jeevitha"==name){
				return "jeevitha@gmail.com";
			}
			if("pooja"==name){
				return "pooja@gmail.com";
			}
			if("anupama"==name){
		    	return "anupama@gmail.com";	
			}
			if("chaya"==name){
				return "chayakm@gmail.com";
			}
			if("surya"==name){
				return "surya@gmail.com";
			}
			if("sushma"==name){
				return "sushma@gmail.com";
			}
			if("usha"==name){
				return "usha@gmail.com";
			}
			if("ravi"==name){
				return "ravi@gmail.com";
			}
			if("bhoomi"==name){
				return "bhoomi@gmail.com";
			}
			if("nithya"==name){
				return "nithya@gmail.com";
			}
		}
		
		else{
			System.out.println("email is invalid");
		}
		return "not valid";
	}
} 