class WalletRunner{
	public static void main(String[] valves){
		System.out.println("invoking main in WalletRunner");
		
		Wallet wallet=new Wallet();
		System.out.println("colour is :"+wallet.colour);
		System.out.println("price is :"+wallet.price);
		System.out.println("closureType is :"+wallet.closureType);
		System.out.println("\n");
		
		Wallet wallet1=new Wallet("pinck",480,"Zipper");
		System.out.println("colour is :"+wallet1.colour);
		System.out.println("price is :"+wallet1.price);
		System.out.println("closureType is :"+wallet1.closureType);
	}
}