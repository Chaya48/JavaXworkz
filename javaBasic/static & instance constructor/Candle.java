class Candle{
     static String brand;
     static String material;
	 int number;
	 float price;
	 
	 
	 Candle(int number,float price)
	 {
	    this.number=number;
        this.price=price;
        System.out.println("invoking instance constructor in Candle");		
	 }
	 static{
		 brand="Boy Smells";
		 material="BeesWax";
		 System.out.println("invoking static constructor in Candle");
		 System.out.println("\n");
	 }
	 static void printstaticCandle(String brand,String material){
		 System.out.println("invoking printstatic in Candle");
		 System.out.println(brand);
		 System.out.println(material);
		 System.out.println("\n");
	 }
	 void printInstanceCandle(int number,float price){
		 System.out.println("invoking printInstance in Candle");
		 System.out.println(number);
		 System.out.println(price);
		 System.out.println("\n");
	 }
	 }
	 