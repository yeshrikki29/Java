class Empc {
	int sal;
	String e_name;
	String emp_grade;

	Empc(int sal, String e_name, String emp_grade) {
		this.sal = sal;
		this.e_name = e_name;
		this.emp_grade = emp_grade;
	}

	public static void main(String[] args) {
		Empc i = new Empc(1879, "rikki", "d");

		System.out.println(i.sal);
		System.out.println(i.e_name);
		System.out.println(i.emp_grade);
	}
}
