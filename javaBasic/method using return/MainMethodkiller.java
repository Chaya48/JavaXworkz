class MainMethodkiller{
	public static void main(String[] vlaves){
		System.out.println(" invoking mainmethod in Owen");
		String heat="heating";
		int duration=20;
		float price=6480;
		Owen.function(heat);
		Owen.function(duration);
		Owen.function(price);
		System.out.println("\n");
		
		System.out.println(" invoking mainmethod in WeighMachine");
		String calculate="mass"; 
		int weight=70;
		float cost=3400f;
		WeighMachine.function(calculate);
		WeighMachine.function(weight);
		WeighMachine.function(cost);
		System.out.println("\n");
		
		System.out.println(" invoking mainmethod in Kulfi");
		String flavour="vanilla";
		int number=4;
		float cost=40;
		Kulfi.tasty(flavour);
		Kulfi.tasty(number);
		Kulfi.tasty(cost);
		
	}
}