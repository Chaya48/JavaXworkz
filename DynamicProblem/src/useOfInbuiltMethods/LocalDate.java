package useOfInbuiltMethods;

public class LocalDate {

	public static void main(String[] args) {

		LocalDate date=new LocalDate();
		System.out.println(date.equals(date));
		System.out.println(date.hashCode());
		System.out.println(date.toString());
		date.notify();
		date.notifyAll();
	}

}
