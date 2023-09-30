class Fabric{
	static int getPrice(String fabric){
		System.out.println("invoking main in Fabric");
		if(fabric!=null){

		if("cotton"==fabric){
			 return 115;
		}
		if("nylon"==fabric){
			return 240;
		}
		if("Woolen"==fabric){
			return 120;
		}
		if("Linen"==fabric){
			return 59;
		}
		if("Polyster"==fabric){
			return 250;
		}
		if("Silk"==fabric){
			return 75;
		}
		}
		else{
			System.out.println("price is invalid ");
		}
		return 0;
	}

	}