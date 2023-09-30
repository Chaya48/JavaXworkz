class JacketMainMethod{
	public static void main(String[] values){
		System.out.println("invoking main in JacketMainMethod");
		
		Jacket jacket=new Jacket();
		Jacket jacket1=new Jacket();

		System.out.println(jacket.brand);
		System.out.println(jacket.colour);
		System.out.println(jacket.price);
		System.out.println(jacket.size);
		System.out.println(jacket.cloth);
		System.out.println("\n");
		
		jacket.brand="puma";
		jacket.colour="black";
		jacket.price=4000;
		jacket.size=36;
		jacket.cloth="fabric";
		
		System.out.println("jacket brand is:"+jacket.brand);
		System.out.println("jacket colour is :"+jacket.colour);
		System.out.println("jacket price is :"+jacket.price);
		System.out.println("jacket size is :"+jacket.size);
		System.out.println("jacket cloth is :"+jacket.cloth);
		System.out.println("=================");
		
		System.out.println(jacket1.brand);
		System.out.println(jacket1.colour);
		System.out.println(jacket1.price);
		System.out.println(jacket1.size);
		System.out.println(jacket1.cloth);
		System.out.println("\n");
		
		jacket1.brand="nike";
		jacket1.colour="white";
		jacket1.price=3000;
		jacket1.size=42;
		jacket1.cloth="cotton";
	
	    System.out.println("jacket1 brand is:"+jacket1.brand);
		System.out.println("jacket1 colour is :"+jacket1.colour);
		System.out.println("jacket1 price is :"+jacket1.price);
		System.out.println("jacket1 size is :"+jacket1.size);
		System.out.println("jacket1 cloth is :"+jacket1.cloth);
	}
}