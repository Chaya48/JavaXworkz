class Cake{
	static void tasty(String name)
	{
		System.out.println("invoking tasty in cake");
		if(name!=null)
		{
			System.out.println("name is valid "+name);
		}
		else{
			System.out.println("name is In-valid "+name);
			return;
		}
	}
	
	static void tasty(float price,String bakeryName){
		if(price>=25){
			System.out.println("price is valid "+price);
		}
		else{
			System.out.println("price is in-valid "+price);
			return;
		}
		if(bakeryName!=null)
		{
			System.out.println("bakery Name is valid "+bakeryName);
		}
		else{
			System.out.println("bakery Name is in-valid "+bakeryName);
			return;
		}
	}
	static void tasty(int noOfPieces,String type){
	if(noOfPieces>=10 && noOfPieces<=25){
		System.out.println("number Of Pieces is valid "+noOfPieces);
	}
	else{
		System.out.println("number of pieces is in-valid "+noOfPieces);
		return;
	}
	if(type!=null)
	{
		System.out.println("type is valid "+type);
	}
	else{
		System.out.println("type is In-valid "+type);
		return;
	}
	}
	static void perpose(String ocassion){
		if(ocassion!=null){
			System.out.println("ocassion is valid "+ocassion);
		}
		else{
			System.out.println("ocassion is in-valid "+ocassion);
			return;
		}
	}
}