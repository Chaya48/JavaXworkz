
public class SystemRunner {

	public static void main(String[] args) {
		SystemRunner system=new SystemRunner();
		System.out.println(System.currentTimeMillis());
		System.out.println(System.getenv("chaya"));
		System.out.println(System.nanoTime());
		System.out.println(System.setProperty("km", "876"));
		System.out.println(System.lineSeparator());
	}

}
