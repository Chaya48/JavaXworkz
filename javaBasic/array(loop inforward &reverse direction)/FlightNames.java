class FlightNames{
	public static void main(String[] args){
		System.out.println("running at main.... ");
		String indiGo="Indi Go";
		String flydubai="Flydubai";
		String gulfAir="Gulf Air";
		String thaiAirways="Thai Airways";
		String akasaAir=" Akasa Air";
		String scoot="Scoot";
		String airIndia=" Air India";
		String[] flights={indiGo,flydubai,gulfAir,thaiAirways,akasaAir,scoot,airIndia};
		int total=flights.length;
		for(int pos=0; pos<flights.length; pos++)
		{
			String ref=flights[pos];
			System.out.println(" assessing element :"+ref +" at position "+pos);
		}
		System.out.println("\n");
		System.out.println(" flights name at 6 position before change"+flights[6]);
		flights[6]="Air Asia India";
		System.out.println(" flights name at 6 position after change"+flights[6]);
		System.out.println("\n");
		System.out.println(" flights name at 5 position before change"+flights[5]);
		flights[5]="Vistara";
		System.out.println(" flights name at 5 position after change"+flights[5]);
		System.out.println("\n");
		for(int pos=flights.length-1; pos>=0; pos--)
		{
			String lef=flights[pos];
			System.out.println(" assessing element :"+lef +" at position "+pos);
	}
	}
}