class Emp {
	int sal;
	String e_name;
	String emp_grade;

	Emp(int a, String b, String c) {
		sal = a;
		e_name = b;
		emp_grade = c;
	}

	public static void main(String[] args) {
		Emp i = new Emp(1879, "rikki", "d");

		System.out.println(i.sal);
		System.out.println(i.e_name);
		System.out.println(i.emp_grade);
	}
}
