class MainMethodInvoking{
	public static void main(String[] valves){
		System.out.println("invoking mainmethod in Scanner");
		String type="QR code Scanner";
		int numer=4;
		float price=1700f;
		Scanner.func(type);
		Scanner.func(numer);
		Scanner.func(price);
		System.out.println("\n");
		
		System.out.println("invoking mainmethod in GoldSmith");
		String category="gold";
		short no=34;
		float cost=4000f;
		GoldSmith.polishing(category);
		GoldSmith.polishing(no);
		GoldSmith.polishing(cost);
		System.out.println("\n");
		
		System.out.println("invoking mainmethod in Soda");
		String flavour="orange";
		int num=6;
		float rate=48f;
		Soda.tasty(flavour);
		Soda.tasty(num);
		Soda.tasty(rate);
		System.out.println("\n");
		
		System.out.println("invoking mainmethod in Stove");
		String powerd="Electricity";
		int use=6;
		short capacity=4;
		Stove.burning(powerd);
		Stove.burning(use);
		Stove.burning(capacity);
	}
}