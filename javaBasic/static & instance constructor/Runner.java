class Runner{
	public static void main(String[] args){
		System.out.println("invoking main in Runner");
		System.out.println("\n");
		
		Helmet helmet=new Helmet(1600,99);
		System.out.println("price is"+helmet.price);
		System.out.println("mass is"+helmet.mass);
		System.out.println("\n");
		
		Helmet.printStatic("Thh","dome");
		helmet.printInstance(2000,99);
        System.out.println("========================================================");
		
		
		Candle candle=new Candle(4,10);
		System.out.println("number is"+candle.number);
		System.out.println("price is"+candle.price);
		System.out.println("\n");
		
		Candle.printstaticCandle("Boy Smells","BeesWax");
		candle.printInstanceCandle(8,10);
		System.out.println("=========================================================");
		
		
		Brick brick=new Brick(200,20);
		System.out.println("price is "+brick.price);
		System.out.println("duration is"+brick.duration);
		System.out.println("\n");
		
		Brick.printStaticBrick("red","rectangle");
		brick.printInstanceBrick(300,20);
		System.out.println("=========================================================");
		
		
		Soil soil=new Soil(60,2.65f);
		System.out.println("temperature is "+soil.temperature);
		System.out.println("density is "+soil.density);
		System.out.println("\n");
		
		Soil.printStaticSoil("red",7.5f);
		soil.printInstanceSoil(60,2.65f);
		System.out.println("==========================================================");
		
		
		Power power=new Power(230,2);
		System.out.println("voltage is "+power.voltage);
		System.out.println("current is "+power.current);
		System.out.println("\n");
		
		Power.printStaticPower(50,88);
		power.printInstancePower(230,2);
		System.out.println("========================================================");
		
		
		Butterfly butterfly=new Butterfly(37,10);
		System.out.println("speed is "+butterfly.speed);
		System.out.println("no of butterfly are "+butterfly.noOfButterfly);
		System.out.println("\n");
		
		Butterfly.printStaticButterfly("orange","monarch");
		butterfly.printInstanceButterfly(37,10);
		System.out.println("========================================================");
		}
}