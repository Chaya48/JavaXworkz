 class Engine{
	 static int getCCByModel(String model){
		 System.out.println("invoking main in Engine");
		 if(model!=null){
			 
				 if("Swift"==model){
					 return 1197;
				 }
				 if("Rapid"==model){
					 return 999;
				 }
				 if("bmw"==model){
					 
					 return 2998;
				 }
				 if("benz"==model){
			
					 return 1993;
				 }
				 if("audi"==model){
			
            		return 1998;
				 }
				 if("Bentley"==model){
			         	 return 5998;
				 }
		 }
			 else{
				 System.out.println(" model name is invalid");
			 }
			 return 0;
	 }
 }
		 
	 
 