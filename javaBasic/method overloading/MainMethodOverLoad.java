class MainMethodOverLoad{
	
		static void installingFloorJoists()
		{
			System.out.println(" carpenter is installing Floor Joists");
		}
		static void fittingInteriors()
		{
			System.out.println(" carpenter is fitting Interiors");
		}
		public static void main(String[] vlavues){
		Carpenter.fixing("wooden door");
		Carpenter.fixing("wooden",1500f,4);
		Carpenter.polishing("teak");
		Carpenter.polishing(5);
		Carpenter.cut(6);
		Carpenter.shape("Round");
		Carpenter.price(5000f);
		Carpenter.refitting("cot",5);
		Carpenter.renovating(2000f);
		Carpenter.installingFloors(3);
		Carpenter.buildingSetFor("film");
		Carpenter.finishing(5978f);
		installingFloorJoists();
		fittingInteriors();
	}
}