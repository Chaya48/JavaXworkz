class WoodRunner{
	public static void main(String[] values){
		System.out.println("'invoking main in WoodRunner");
	
		Wood wood=new Wood();
		System.out.println("\n");
		
		Wood wood1=new Wood("teak",3500);
		System.out.println("\n");
		
		Wood wood2=new Wood("teak",3500,"chair");
		System.out.println("\n");
		
		Wood wood3=new Wood("teak",3500,"chair","paper",10);
		System.out.println("\n");
		System.out.println("=======================================================================================");
		
		Mall mall=new Mall();
		System.out.println("\n");
		
		Mall mall1=new Mall("Regional","Phoenix Market city",10,15);
		System.out.println("\n");
		
		Mall mall2=new Mall("Regional","Phoenix Market city",10,15,25,1500,10000);
		System.out.println("\n");
		System.out.println("============================================================================================");
		
		Park park=new Park("Zen park","Nature Park");
		System.out.println("\n");
		
		Park park1=new Park("Zen park","Nature Park",300,100,"swing");
		System.out.println("\n");
		
		Park park2=new Park("Zen park","Nature park",300,100,"swing",50,2,5.30d,10.00d);
		System.out.println("\n");
		System.out.println("===============================================================================================================");
	}
}