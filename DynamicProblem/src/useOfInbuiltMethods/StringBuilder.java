package useOfInbuiltMethods;

public class StringBuilder {

	public static void main(String[] args) {

		StringBuilder builder=new StringBuilder();
		System.out.println(builder.equals(builder));
		System.out.println(builder.hashCode());
		System.out.println(builder.toString());
		builder.notify();
		builder.notifyAll();
	}

}
