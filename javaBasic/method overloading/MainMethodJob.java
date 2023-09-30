class MainMethodJob{
	public static void main(String[] values){
		System.out.println("invoking MainMethod Job");
		Job.apply();
		Job.apply("chaya",1);
		Job.apply("chaya",2,"jeevith");
		Job.apply(3);
		Job.rejecctOffer();
		System.out.println("\n");
		System.out.println(" invoking main method resume ");
		Resume.format();
		Resume.format("fresher");
		Resume.format("fresher",2);
		Resume.clear();
		Resume.delete();
	}
}