class PocketMainMethod{
	
public static void main(String[] args){
	System.out.println("invoking main in PocketMainMethod");
	
	
	Pocket pocket=new Pocket();
	Pocket pocket1=new Pocket();
	System.out.println(pocket.brand);
	System.out.println(pocket.price);
	System.out.println(pocket.colour);
	System.out.println(pocket.size);
	System.out.println(pocket.numbers);
	System.out.println("\n");
	
   pocket.brand="gsha";
   pocket.price=250;
   pocket.colour="black";
   pocket.size='s';
   pocket.numbers=24;
   
     System.out.println("brand is "+pocket.brand);
	 System.out.println("price is "+pocket.price);
	 System.out.println("colour is"+pocket.colour);
	 System.out.println("size is "+pocket.size);
	 System.out.println("numbers is "+pocket.numbers);
	 System.out.println("============================");
	 
    System.out.println(pocket1.brand);
	System.out.println(pocket1.price);
	System.out.println(pocket1.colour);
	System.out.println(pocket1.size);
	System.out.println(pocket.numbers);
	System.out.println("\n");
	
    pocket1.brand="jsjj";
    pocket1.price=480;
    pocket1.colour="brown";
    pocket1.size='M';
    pocket1.numbers=4;
   
     System.out.println("brand is "+pocket1.brand);
	 System.out.println("price is "+pocket1.price);
	 System.out.println("colour is"+pocket1.colour);
	 System.out.println("size is "+pocket1.size);
	 System.out.println("numbers is "+pocket1.numbers);
	
}
}