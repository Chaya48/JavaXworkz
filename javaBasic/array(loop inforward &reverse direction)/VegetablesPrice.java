class VegetablesPrice{
	public static void main(String[] valves){
		System.out.println("Running vegetables price in main..");
		float onion=30f;
		float tomato=60f;
		float greenChilli=60f;
		float beetroot=40f;
		float patato=40f;
		float capsicum=50f;
		float carrot=62f;
		float[] vegetables={onion,tomato,greenChilli,beetroot,patato,capsicum,carrot};
		int total=vegetables.length;
		for( int pos=0; pos<vegetables.length; pos++)
		{
			float ref=vegetables[pos];
			System.out.println(" assessing element :"+ref +" at position :"+pos);
		}
		System.out.println("\n");
		System.out.println(" vegetables price at 6 position before change "+vegetables[6]);
		vegetables[6]=70f;
		System.out.println(" vegetables price at 6 position after change "+vegetables[6]);
		System.out.println("\n");
		System.out.println(" vegetables price at 5 position before change "+vegetables[5]);
		vegetables[5]=80f;
		System.out.println(" vegetables price at 5 position after change "+vegetables[5]);
     	System.out.println("\n");
		for( int pos=vegetables.length-1; pos>=0; pos--)
		{
			float ref=vegetables[pos];
			System.out.println(" assessing element :"+ref +" at position "+ pos);
		}
	}
}