class Wood{
	String type;
	double price;
	String materialsOfWood;
	String use;
	int number;
	
	Wood(){
		System.out.println("invoking no-args constructor in Wood");
	}
	Wood(String type){
		this.type=type;
		System.out.println("invoking String constructor in wood");
	}
	Wood(String type,double price){
		this(type);
		this.price=price;
		System.out.println("invoking String,double constructor in Wood");
	}
	Wood(String type,double price,String materialsOfWood){
		this(type,price);
		this.materialsOfWood=materialsOfWood;
		System.out.println("invoking String, double, String constructor in Wood");
	}
	Wood(String type,double price,String materialsOfWood, String use){
		this(type,price,materialsOfWood);
		this.use=use;
		System.out.println("invoking String, double, String, String constructor in Wood");
	}
	Wood(String type,double price,String materialsOfWood, String use,int number){
		this(type,price,materialsOfWood,use);
		this.number=number;
		System.out.println("invoking String, double, String, String,int constructor in Wood");

	}
}