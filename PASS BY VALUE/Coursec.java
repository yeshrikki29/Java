class Coursec {
	int cost;
	String course_name;
	String university;

	Coursec(int cost, String course_name, String university) {
		this.cost = cost;
		this.course_name = course_name;
		this.university = university;
	}

	public static void main(String[] args) {
		Coursec i = new Coursec(1879, "Lpg", "reddit");

		System.out.println(i.cost);
		System.out.println(i.course_name);
		System.out.println(i.university);
	}
}
