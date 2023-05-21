class School {
	int scl_strength;
	String scl_name;
	String scl_grade;

	School(int a, String b, String c) {
		scl_strength = a;
		scl_name = b;
		scl_grade = c;
	}

	public static void main(String[] args) {
		School i = new School(18795, "MABL", "A++");

		System.out.println(i.scl_strength);
		System.out.println(i.scl_name);
		System.out.println(i.scl_grade);
	}
}
