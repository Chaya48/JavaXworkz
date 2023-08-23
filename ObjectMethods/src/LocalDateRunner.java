import java.time.LocalDate;

public class LocalDateRunner {

	public static void main(String[] args) {
		LocalDateRunner localDate=new LocalDateRunner();
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.of(2001, 06,9));
		System.out.println(LocalDate.of(2000, 12, 29));
	}

}
