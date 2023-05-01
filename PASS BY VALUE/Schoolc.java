class Schoolc {
	int scl_strength;
	String scl_name;
	String scl_grade;

	Schoolc(int scl_strength, String scl_name, String scl_grade) {
		this.scl_strength = scl_strength;
		this.scl_name = scl_name;
		this.scl_grade = scl_grade;
	}

	public static void main(String[] args) {
		Schoolc i = new Schoolc(18795, "MABL", "A++");

		System.out.println(i.scl_strength);
		System.out.println(i.scl_name);
		System.out.println(i.scl_grade);
	}
}
