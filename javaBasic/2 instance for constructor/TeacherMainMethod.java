class TeacherMainMethod{
	public static void main(String[] values){
		System.out.println("invoking main in TeacherMainMethod");
		
		Teacher teacher=new Teacher();
		System.out.println(teacher.name);
		System.out.println(teacher.salary);
		System.out.println(teacher.subject);
		System.out.println(teacher.experince);
		System.out.println(teacher.from);
		System.out.println("\n");
		
		teacher.name="omkar";
		teacher.salary=50000;
		teacher.subject="java";
		teacher.experince=13;
		teacher.from="Bengaluru";
		
		System.out.println("name is :"+teacher.name);
		System.out.println("salary is :"+teacher.salary);
		System.out.println("subject is :"+teacher.subject);
		System.out.println("experince is :"+teacher.experince);
		System.out.println("from :"+teacher.from);
		System.out.println("===================================");
		
		Teacher teacher1=new Teacher();
		System.out.println(teacher1.name);
		System.out.println(teacher1.salary);
		System.out.println(teacher1.subject);
		System.out.println(teacher1.experince);
		System.out.println(teacher1.from);
		System.out.println("\n");
		
		teacher1.name="Nagaraj";
		teacher1.salary=60000;
		teacher1.subject="web";
		teacher1.experince=12;
		teacher1.from="hassan";
		
		System.out.println("name is :"+teacher1.name);
		System.out.println("salary is :"+teacher1.salary);
		System.out.println("subject is :"+teacher1.subject);
		System.out.println("experince is :"+teacher1.experince);
		System.out.println("from :"+teacher1.from);
		

	}
}