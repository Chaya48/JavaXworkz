class GymMainMethod{
	public static void main(String[] agrs){
		System.out.println("invoking main in GymMainMethod");
		Gym gym=new Gym();
		System.out.println(gym.name);
		System.out.println(gym.numbers);
		System.out.println(gym.price);
		System.out.println(gym.place);
		System.out.println(gym.type);
		System.out.println("\n");
		
		gym.name="puttu fitness";
		gym.numbers=20;
		gym.price=3999f;
		gym.place="Annapurneshwarinagar";
		gym.type="Bodybuilding";
		
		System.out.println("name is :"+gym.name);
		System.out.println("numbers :"+gym.numbers);
		System.out.println("price :"+gym.price);
		System.out.println("place :"+gym.place);
		System.out.println("type :"+gym.type);
		System.out.println("=============================");
		
		Gym gym1=new Gym();
		System.out.println(gym1.name);
		System.out.println(gym1.numbers);
		System.out.println(gym1.price);
		System.out.println(gym1.place);
		System.out.println(gym1.type);
		System.out.println("\n");
		
		gym1.name="appi fitness";
		gym1.numbers=25;
		gym1.price=3000f;
		gym1.place="nagarabhavi";
		gym1.type="Aerobic exercise";
		
		System.out.println("name is :"+gym1.name);
		System.out.println("numbers :"+gym1.numbers);
		System.out.println("price :"+gym1.price);
		System.out.println("place :"+gym1.place);
		System.out.println("type :"+gym1.type);
	}
}