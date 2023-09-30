class WondersOfTheWorld{
	public static void main(String[] args){
		System.out.println(" running at main.... ");
		String one=" The Colosseum";
		String two=" The great wall of china";
		String three="The Taj Mahal";
		String four=" Christ the Redeemer";
		String five="Machu Picchu";
		String six="Chichen Itza";
		String seven="Petra";
		String[] wonders={one,two,three,four,five,six,seven};
		int total=wonders.length;
		for(int pos=0; pos<wonders.length; pos++)
		{
			String ref=wonders[pos];
			System.out.println(" assessing element "+ref +" at position "+pos);
		}
			System.out.println("\n");
		
		System.out.println("wonders name at position 6 before change"+ wonders[6]);
		wonders[6]="The Pyramid of Giza";
		System.out.println("wonders name at position 6 after change"+ wonders[6]);
		System.out.println("\n");
		
		System.out.println("wonders name at position 6 before change"+ wonders[5]);
		wonders[5]="Grand Canyon";
		System.out.println("wonders name at position 6 after change"+ wonders[5]);
		System.out.println("\n");
		for(int pos=wonders.length-1; pos>=0; pos--)
		{
			String lef=wonders[pos];
			System.out.println(" assessing element "+lef +" at position "+pos);
		}
	}
}