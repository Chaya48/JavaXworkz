class MainMethodEngine{
	public static void main(String[] args){
		System.out.println("invoking mainMethod in Engine");
		int cc=Engine.getCCByModel("Swift");
		System.out.println("Swift CC :"+cc);
		int cc1=Engine.getCCByModel("Rapid");
		System.out.println("Rapid CC  :"+cc1);
		System.out.println("\n");
		
		System.out.println("invoking mainMethod in train");
		String trainName=Train.getTrainName(11013);
		System.out.println("Train name is :"+trainName);
		String trainName1=Train.getTrainName(12134);
		System.out.println("Train name is :"+trainName1);
		System.out.println("\n");
		
		System.out.println("invoking mainMethod in Fabric");
		 int price=Fabric.getPrice("Silk");
		System.out.println("silk price is :"+price);
		int price1=Fabric.getPrice("nylon");
		System.out.println("nylon price is :"+price1);
		System.out.println("\n");
		
		System.out.println("invoking mainMethod in person");
		int age=PersonReturn.getAgeByName("chaya");
		System.out.println("chaya age is :"+age);
		String email=PersonReturn.getEmailByName("surya");
		System.out.println("surya email is :"+email);
	}
}