class CarramRunner{
	public static void main(String[] values){
		System.out.println("invoing main in CarramRunner");
		
		Carram carram=new Carram();
		System.out.println(carram.numberOfPlayers);
		System.out.println(carram.genres);
		System.out.println(carram.equipment);
		System.out.println(carram.firstInventedBy);
		System.out.println(carram.price);
		System.out.println("\n");
		
		Carram carram1=new Carram(2);
		System.out.println(carram1.numberOfPlayers);
		System.out.println(carram1.genres);
		System.out.println(carram1.equipment);
		System.out.println(carram1.firstInventedBy);
		System.out.println(carram1.price);
		System.out.println("\n");
		
		Carram carram2=new Carram(3,"board game");
		System.out.println(carram2.numberOfPlayers);
		System.out.println(carram2.genres);
		System.out.println(carram2.equipment);
		System.out.println(carram2.firstInventedBy);
		System.out.println(carram2.price);
		System.out.println("\n");
		
		Carram carram3=new Carram(4,"board type","square board");
		System.out.println(carram3.numberOfPlayers);
		System.out.println(carram3.genres);
		System.out.println(carram3.equipment);
		System.out.println(carram3.firstInventedBy);
		System.out.println(carram3.price);
		System.out.println("\n");
		
		Carram carram4=new Carram(4,"board game","square board","India");
		System.out.println(carram4.numberOfPlayers);
		System.out.println(carram4.genres);
		System.out.println(carram4.equipment);
		System.out.println(carram4.firstInventedBy);
		System.out.println(carram4.price);
		System.out.println("\n");
		
		Carram carram5=new Carram(4,"board game","square board","India",2499f);
		System.out.println(carram5.numberOfPlayers);
		System.out.println(carram5.genres);
		System.out.println(carram5.equipment);
		System.out.println(carram5.firstInventedBy);
		System.out.println(carram5.price);
		System.out.println("\n");
	}
}