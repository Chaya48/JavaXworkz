class BiscuitNames{
	public static void main(String[] valves){
		System.out.println("Running Biscuit names in main");
		String darkFantasy="Dark Fantasy";
		String oreo="Oreo";
		String hideAndSeek="Hide and Seek";
        String nutriChoice="Nutri Choice";
        String goodDay="Good Day";
        String momsMagic="Moms Magic";
        String mariBiscuit="Mari Biscuit";
        String[] biscuits={darkFantasy,oreo,hideAndSeek,nutriChoice,goodDay,momsMagic,mariBiscuit};
int total=biscuits.length;
for( int pos=0; pos<biscuits.length; pos++){
String lef=biscuits[pos];
System.out.println("assessing element :"+lef +" at position "+pos);	
}
System.out.println("\n");
System.out.println(" Biscuit at position 6 before change "+biscuits[6]);
biscuits[6]="Cream Biscuit";
System.out.println(" Biscuit at position 6 after change "+biscuits[6]);
System.out.println("\n");
System.out.println(" Biscuit at position 6 before change "+biscuits[5]);
biscuits[5]="parle-G";
System.out.println(" Biscuit at position 6 before change "+biscuits[5]);
System.out.println("\n");
for (int pos=biscuits.length-1; pos>=0; pos--){
	String ref=biscuits[pos];
	System.out.println(" assessing element :"+ref +" at position "+pos);
}
	}
}