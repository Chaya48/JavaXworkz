class OilRunner{
	public static void main(String[] args){
		System.out.println("invoking main OilRunner");
		
		Oil oil=new Oil();
		System.out.println(oil.name);
		System.out.println(oil.viscosity);
		System.out.println(oil.quantity);
		System.out.println("\n");
		
		Oil oil1=new Oil("sun flower");
		System.out.println(oil1.name);
		System.out.println(oil1.viscosity);
		System.out.println(oil1.quantity);
		System.out.println("\n");

		
		Oil oil2=new Oil("sun flower",150);
		System.out.println(oil2.name);
		System.out.println(oil2.viscosity);
		System.out.println(oil2.quantity);
		System.out.println("\n");

		
		Oil oil3=new Oil("sun flower",150,8);
		System.out.println(oil3.name);
		System.out.println(oil3.viscosity);
		System.out.println(oil3.quantity);
		
	}
}