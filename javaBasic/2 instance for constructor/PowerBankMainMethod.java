class PowerBankMainMethod{
	public static void main(String[] values){
		System.out.println("invoking main in PowerBankMainMethod");
	
		PowerBank powerbank=new PowerBank();
		System.out.println(powerbank.cost);
		System.out.println(powerbank.capacity);
		System.out.println(powerbank.brand);
		System.out.println(powerbank.connectorType);
		System.out.println(powerbank.feature);
		System.out.println("\n");
		
		powerbank.cost=1899;
		powerbank.capacity=20000;
		powerbank.brand="Ambrane";
		powerbank.connectorType="USB Type C";
		powerbank.feature="fast charging";
		
		System.out.println("powerbank cost is :"+powerbank.cost);
		System.out.println("powerbank capacity is :"+powerbank.capacity);
		System.out.println("powerbank brand is :"+powerbank.brand);
		System.out.println("powerbank connectorType is :"+powerbank.connectorType );
		System.out.println("powerbank feature is :"+powerbank.feature);
		System.out.println("================================================");
		
		PowerBank powerbank1=new PowerBank();
		System.out.println(powerbank1.cost);
		System.out.println(powerbank1.capacity);
		System.out.println(powerbank1.brand);
		System.out.println(powerbank1.connectorType);
		System.out.println(powerbank1.feature);
		System.out.println("\n");
		
		powerbank1.cost=1998;
		powerbank1.capacity=25000;
		powerbank1.brand="MI";
		powerbank1.connectorType="USB,micro USB";
		powerbank1.feature="short circuit protection";
		
		System.out.println("cost is :"+powerbank.cost);
		System.out.println("capacity is :"+powerbank.capacity);
		System.out.println("brand is :"+powerbank.brand);    
		System.out.println("connector Type is :"+powerbank.connectorType);
		System.out.println("feature is :"+powerbank.feature);
		
	}
}