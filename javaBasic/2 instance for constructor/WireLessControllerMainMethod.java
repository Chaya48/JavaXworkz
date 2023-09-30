class WireLessControllerMainMethod{
	public static void main(String[] args){
		System.out.println("invoking main in WireLessControllerMainMethod");
		
		WireLessController wireLessController=new WireLessController();
		System.out.println(wireLessController.brand);
		System.out.println(wireLessController.pricce);
		System.out.println(wireLessController.colour);
		System.out.println(wireLessController.type);
		System.out.println(wireLessController.compatibleDevices);
		System.out.println("\n");
		
		wireLessController.brand="CLAW";
		wireLessController.pricce=1379;
		wireLessController.colour="black";
		wireLessController.type="Gamepad";
		wireLessController.compatibleDevices="Windows";
		
		System.out.println("brand is :"+wireLessController.brand);
		System.out.println("pricce is :"+wireLessController.pricce);
		System.out.println("colour is :"+wireLessController.colour);
		System.out.println("type :"+wireLessController.type);
		System.out.println("compatible Devices :"+wireLessController.compatibleDevices);
		System.out.println("=========================================");
		
		WireLessController wireLessController1=new WireLessController();
		System.out.println(wireLessController1.brand);
		System.out.println(wireLessController1.pricce);
		System.out.println(wireLessController1.colour);
		System.out.println(wireLessController1.type);
		System.out.println(wireLessController1.compatibleDevices);
		System.out.println("\n");
		
		wireLessController1.brand="Cosmic Byte";
		wireLessController1.pricce=1699;
		wireLessController1.colour="white";
		wireLessController1.type="Gamepad";
		wireLessController1.compatibleDevices="PC";
		
		System.out.println("brand is :"+wireLessController1.brand);
		System.out.println("pricce is :"+wireLessController1.pricce);
		System.out.println("colour is :"+wireLessController1.colour);
		System.out.println("type :"+wireLessController1.type);
		System.out.println("compatible Devices :"+wireLessController1.compatibleDevices);
	}
}