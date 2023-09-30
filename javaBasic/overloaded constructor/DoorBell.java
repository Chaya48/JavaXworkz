class DoorBell{
	String manufacturer;
	String countryOfOrigin;
	String modelName;
	int weight;
	String type;
	int range;
	float price;
	
	DoorBell(){
		System.out.println("invoking no-args construcutor");
		System.out.println(this.manufacturer);
		System.out.println(this.countryOfOrigin);
		System.out.println(this.modelName);
		System.out.println(this.weight);
		System.out.println(this.type);
		System.out.println(this.range);
		System.out.println(this.price);
	}
	
	DoorBell(String manufacturer){
		System.out.println("invoking String construcutor");
		this.manufacturer=manufacturer;
	}
	DoorBell(String manufacturer,String countryOfOrigin){
		System.out.println("invoking String,String construcutor");
		this.manufacturer=manufacturer;
		this.countryOfOrigin=countryOfOrigin;
	}
	DoorBell(String manufacturer,String countryOfOrigin,String modelName){
		System.out.println("invoking String,String,String construcutor");
		this.manufacturer=manufacturer;
		this.countryOfOrigin=countryOfOrigin;
		this.modelName=modelName;
	}
	DoorBell(String manufacturer,String countryOfOrigin,String modelName,int weight){
		System.out.println("invoking String,String,String,weight construcutor");
		this.manufacturer=manufacturer;
		this.countryOfOrigin=countryOfOrigin;
		this.modelName=modelName;
		this.weight=weight;
	}
	DoorBell(String manufacturer,String countryOfOrigin,String modelName,int weight,String type){
		System.out.println("invoking String,String,String,weight,String construcutor");
		this.manufacturer=manufacturer;
		this.countryOfOrigin=countryOfOrigin;
		this.modelName=modelName;
		this.weight=weight;
		this.type=type;
	}
	DoorBell(String manufacturer,String countryOfOrigin,String modelName,int weight,String type,int range){
		System.out.println("invoking String,String,String,weight,String,int construcutor");
		this.manufacturer=manufacturer;
		this.countryOfOrigin=countryOfOrigin;
		this.modelName=modelName;
		this.weight=weight;
		this.type=type;
		this.range=range;
	}
	DoorBell(String manufacturer,String countryOfOrigin,String modelName,int weight,String type,int range,float price){
		System.out.println("invoking String,String,String,weight,String,int construcutor");
		this.manufacturer=manufacturer;
		this.countryOfOrigin=countryOfOrigin;
		this.modelName=modelName;
		this.weight=weight;
		this.type=type;
		this.range=range;
		this.price=price;
	}
	
}