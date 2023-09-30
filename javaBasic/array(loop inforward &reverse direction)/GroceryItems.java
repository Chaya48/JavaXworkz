class GroceryItems{
	public static void main(String[] valves){
		System.out.println("Running at main Grocery Items........");
		String  sugar="Sugar";
		String  rice="Rice";
		String  rava="Rava";
		String  maida="Maida";
		String dal="Dal";
		String besanFlour="Besan Flour";
		String cookingOil="Cooking Oil";
		String[] groceries={sugar,rice,rava,maida,dal,besanFlour,cookingOil};
		int total=groceries.length;
		
		    for(int position=0 ;position<groceries.length; position++)
			{
				String ref=groceries[position];
				System.out.println(" Assessing element :"+ref +  "  at position :"+position);
			}
				System.out.println("\n");
			System.out.println("Grocery at position 6 before change "+groceries[6]);
		groceries[6]="Salt";
		System.out.println("Grocery at position 6 after change "+groceries[6]);
		System.out.println("\n");
		System.out.println("Grocery at position 5 before change "+groceries[5]);
			groceries[5]="Soup";
		System.out.println("Grocery at position 5 after change "+groceries[5]);	
		System.out.println("\n");
			System.out.println("\n");
			for(int position=groceries.length-1; position>=0; position--)
			{
				String ref1=groceries[position];
				System.out.println("Assessing element :"+ref1 + "  at position :"+position);
			}
	}
}