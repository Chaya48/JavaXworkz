import java.util.Date;

public class DateRunner {

	public static void main(String[] args) {
		Date date = new Date(4 - 8 - 2023);
		boolean afterdate = date.after(date);
		System.out.println(afterdate);
		boolean beforedate = date.before(date);
		System.out.println(beforedate);
		int compare = date.compareTo(date);
		System.out.println(compare);
		int ref = 12 - 4 - 23;
		 System.out.println(ref);
		int hash = date.hashCode();
		System.out.println(hash);
		date.setTime(hash);
	}

}
