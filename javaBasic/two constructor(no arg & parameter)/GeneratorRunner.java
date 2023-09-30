class GeneratorRunner{
	public static void main(String[] values){
		System.out.println("invoking main in GeneratorRunner");
		System.out.println("\n");
		
		Generator generator=new Generator();
        System.out.println("wattage is:"+generator.wattage);
        System.out.println("voltage is:"+generator.voltage);
        System.out.println("weight is:"+generator.weight);
		System.out.println("\n");

		Generator generator1=new Generator(720,110,16.8f);
		System.out.println("wattage is:"+generator1.wattage);
		System.out.println("voltage is:"+generator1.voltage);
		System.out.println("weight is:"+generator1.weight);
	}
}