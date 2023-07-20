class Logo{
	
	String colour;
	int numberOfWords;
	String design;
	float price;
	int width;
	int lenth;
	String shape;
	String technology;
	String name;
	
	Logo(){
	System.out.println("invoking no-args constructor");
	System.out.println(this.colour);
	System.out.println(this.numberOfWords);
	System.out.println(this.design);
	System.out.println(this.price);
	System.out.println(this.width);
	System.out.println(this.lenth);
	System.out.println(this.shape);
	System.out.println(this.technology);
	System.out.println(this.name);
	System.out.println("\n");
	}
	
	Logo(String colour){
		System.out.println("invoking String  constructor");
		this.colour=colour;
	}
	Logo(String colour,int numberOfWords){
		System.out.println("invoking String, int  constructor");
		this.colour=colour;
		this.numberOfWords=numberOfWords;
	}
	Logo(String colour,int numberOfWords,String design){
		System.out.println("invoking String, int,String constructor");
		this.colour=colour;
		this.numberOfWords=numberOfWords;
		this.design=design;
	}
	Logo(String colour,int numberOfWords,String design,float price){
		System.out.println("invoking String, int,String,float constructor");
		this.colour=colour;
		this.numberOfWords=numberOfWords;
		this.design=design;
		this.price=price;
	}
	Logo(String colour,int numberOfWords,String design,float price,int width ){
		System.out.println("invoking String, int,String,float, int constructor");
		this.colour=colour;
		this.numberOfWords=numberOfWords;
		this.design=design;
		this.price=price;
		this.width=width;
	}
	Logo(String colour,int numberOfWords,String design,float price,int width,int lenth){
		System.out.println("invoking String, int,String,float,int, int constructor");
		this.colour=colour;
		this.numberOfWords=numberOfWords;
		this.design=design;
		this.price=price;
		this.width=width;
		this.lenth=lenth;
	}
	Logo(String colour,int numberOfWords,String design,float price,int width,int lenth,String shape ){
		System.out.println("invoking String, int,String,float,int, int,String constructor");
		this.colour=colour;
		this.numberOfWords=numberOfWords;
		this.design=design;
		this.price=price;
		this.width=width;
		this.lenth=lenth;
		this.shape=shape;
	}
	Logo(String colour,int numberOfWords,String design,float price,int width,int lenth,String shape,String technology ){
		System.out.println("invoking String, int,String,float,int, int,String,String constructor");
		this.colour=colour;
		this.numberOfWords=numberOfWords;
		this.design=design;
		this.price=price;
		this.width=width;
		this.lenth=lenth;
		this.shape=shape;
		this.technology=technology;
	}
	Logo(String colour,int numberOfWords,String design,float price,int width,int lenth,String shape,String technology,String name ){
		System.out.println("invoking String, int,String,float,int, int,String,String,String constructor");
		this.colour=colour;
		this.numberOfWords=numberOfWords;
		this.design=design;
		this.price=price;
		this.width=width;
		this.lenth=lenth;
		this.shape=shape;
		this.technology=technology;
		this.name=name;
	}
}