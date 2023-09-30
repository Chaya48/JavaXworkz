class PhotoFrameRunner{
	public static void main(String[] valves){
		System.out.println("invoking main in PhotoFrameRunner");
		System.out.println("\n");
		
	PhotoFrame photoFrame=new PhotoFrame();
	System.out.println("colour is :"+photoFrame.colour);
	System.out.println("shape is :"+photoFrame.shape);
	System.out.println("price is :"+photoFrame.price);
	System.out.println("\n");
	
	PhotoFrame photoFrame1=new PhotoFrame("white","Rectangular",749);
	System.out.println("colour is :"+photoFrame1.colour);
	System.out.println("shape is :"+photoFrame1.shape);
	System.out.println("price is :"+photoFrame1.price);
	}
}