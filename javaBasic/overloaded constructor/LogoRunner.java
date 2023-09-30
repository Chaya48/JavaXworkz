class LogoRunner{
	public static void main(String[] args){
		System.out.println("invoking main in LogoRunner");
		
		Logo logo=new Logo();
		System.out.println(logo.colour);
		System.out.println(logo.numberOfWords);
		System.out.println(logo.design);
		System.out.println(logo.price);
		System.out.println(logo.width);
		System.out.println(logo.lenth);
		System.out.println(logo.shape);
		System.out.println(logo.technology);
		System.out.println(logo.name);
		System.out.println("\n");
		
		Logo logo1=new Logo("black");
		System.out.println(logo1.colour);
		System.out.println(logo1.numberOfWords);
		System.out.println(logo1.design);
		System.out.println(logo1.price);
		System.out.println(logo1.width);
		System.out.println(logo1.lenth);
		System.out.println(logo1.shape);
		System.out.println(logo1.technology);
		System.out.println(logo1.name);
		System.out.println("\n");
		
		Logo logo2=new Logo("black",10);
		System.out.println(logo2.colour);
		System.out.println(logo2.numberOfWords);
		System.out.println(logo2.design);
		System.out.println(logo2.price);
		System.out.println(logo2.width);
		System.out.println(logo2.lenth);
		System.out.println(logo2.shape);
		System.out.println(logo2.technology);
		System.out.println(logo2.name);
		System.out.println("\n");
		
		Logo logo3=new Logo("black",10,"flower");
		System.out.println(logo3.colour);
		System.out.println(logo3.numberOfWords);
		System.out.println(logo3.design);
		System.out.println(logo3.price);
		System.out.println(logo3.width);
		System.out.println(logo3.lenth);
		System.out.println(logo3.shape);
		System.out.println(logo3.technology);
		System.out.println(logo3.name);
		System.out.println("\n");
		
		Logo logo4=new Logo("black",10,"flower",2890);
		System.out.println(logo4.colour);
		System.out.println(logo4.numberOfWords);
		System.out.println(logo4.design);
		System.out.println(logo4.price);
		System.out.println(logo4.width);
		System.out.println(logo4.lenth);
		System.out.println(logo4.shape);
		System.out.println(logo4.technology);
		System.out.println(logo4.name);
		System.out.println("\n");
		
		Logo logo5=new Logo("black",10,"flower",2890,12);
		System.out.println(logo5.colour);
		System.out.println(logo5.numberOfWords);
		System.out.println(logo5.design);
		System.out.println(logo5.price);
		System.out.println(logo5.width);
		System.out.println(logo5.lenth);
		System.out.println(logo5.shape);
		System.out.println(logo5.technology);
		System.out.println(logo5.name);
		System.out.println("\n");
		
		Logo logo6=new Logo("black",10,"flower",2890,12,15);
		System.out.println(logo6.colour);
		System.out.println(logo6.numberOfWords);
		System.out.println(logo6.design);
		System.out.println(logo6.price);
		System.out.println(logo6.width);
		System.out.println(logo6.lenth);
		System.out.println(logo6.shape);
		System.out.println(logo6.technology);
		System.out.println(logo6.name);
		System.out.println("\n");
		
		Logo logo7=new Logo("black",10,"flower",2890,12,15,"square");
		System.out.println(logo7.colour);
		System.out.println(logo7.numberOfWords);
		System.out.println(logo7.design);
		System.out.println(logo7.price);
		System.out.println(logo7.width);
		System.out.println(logo7.lenth);
		System.out.println(logo7.shape);
		System.out.println(logo7.technology);
		System.out.println(logo7.name);
		System.out.println("\n");
		
		
		Logo logo8=new Logo("black",10,"flower",2890,12,15,"square","graphic");
		System.out.println(logo8.colour);
		System.out.println(logo8.numberOfWords);
		System.out.println(logo8.design);
		System.out.println(logo8.price);
		System.out.println(logo8.width);
		System.out.println(logo8.lenth);
		System.out.println(logo8.shape);
		System.out.println(logo8.technology);
		System.out.println(logo8.name);
		System.out.println("\n");
		
		Logo logo9=new Logo("black",10,"flower",2890,12,15,"square","graphic","xworkz");
		System.out.println(logo9.colour);
		System.out.println(logo9.numberOfWords);
		System.out.println(logo9.design);
		System.out.println(logo9.price);
		System.out.println(logo9.width);
		System.out.println(logo9.lenth);
		System.out.println(logo9.shape);
		System.out.println(logo9.technology);
		System.out.println(logo9.name);
		System.out.println("\n");
	}
}