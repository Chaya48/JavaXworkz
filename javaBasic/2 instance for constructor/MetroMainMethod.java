class MetroMainMethod{
	public static void main(String[] valves){
		System.out.println("invoking main in MetroMainMethod");
		
		Metro metro=new Metro();
		System.out.println(metro.nativeName);
		System.out.println(metro.locale);
		System.out.println(metro.numberOfStations);
		System.out.println(metro.trainLength);
		System.out.println(metro.numberOfTracks);
		System.out.println("\n");
		
		metro.nativeName="Namma Metro";
		metro.locale="Bengaluru";
		metro.numberOfStations=63;
		metro.trainLength=6;
		metro.numberOfTracks=2;
		
		System.out.println("native Name is :"+metro.nativeName);
		System.out.println("locale is :"+metro.locale);
		System.out.println("number Of Stations :"+metro.numberOfStations);
		System.out.println("Train Length :"+metro.trainLength);
		System.out.println("number Of Tracks :"+metro.numberOfTracks);
		System.out.println("=====================================================");
		
		Metro metro1=new Metro();
		System.out.println(metro1.nativeName);
		System.out.println(metro1.locale);
		System.out.println(metro1.numberOfStations);
		System.out.println(metro1.trainLength);
		System.out.println(metro1.numberOfTracks);
		System.out.println("\n");
		
		metro1.nativeName="NammaMetro";
		metro1.locale="Bengaluru";
		metro1.numberOfStations=62;
		metro1.trainLength=5;
		metro1.numberOfTracks=2;
		
		System.out.println("native Name is :"+metro1.nativeName);
		System.out.println("locale is :"+metro1.locale);
		System.out.println("number Of Stations :"+metro1.numberOfStations);
		System.out.println("Train Length :"+metro1.trainLength);
		System.out.println("number Of Tracks :"+metro1.numberOfTracks);
	}
}