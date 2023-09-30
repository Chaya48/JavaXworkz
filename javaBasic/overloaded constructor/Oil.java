class Oil{
	String name;
	float viscosity;
	int quantity;
	
	Oil(){
		System.out.println("invoking no-args constructor");
		System.out.println(this.name);
		System.out.println(this.viscosity);
		System.out.println(this.quantity);
	}
	Oil(String name){
		System.out.println("invoking String constructor");
		this.name=name;
	}
	Oil(String name,float viscosity){
		System.out.println("invoking String, float constructor");
		this.name=name;
		this.viscosity=viscosity;
	}
	Oil(String name,float viscosity,int quantity){
		System.out.println("invoking String,float,int constructor");
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
}