class Course {
	int cost;
	String course_name;
	String university;

	Course(int a, String b, String c) {
		cost = a;
		course_name = b;
		university = c;
	}

	public static void main(String[] args) {
		Course i = new Course(1879, "Lpg", "reddit");

		System.out.println(i.cost);
		System.out.println(i.course_name);
		System.out.println(i.university);
	}
}
