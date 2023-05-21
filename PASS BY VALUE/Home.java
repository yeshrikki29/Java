class Home {
	int cost;
	String home_name;
	String home_colour;

	Home(int a, String b, String c) {
		cost = a;
		home_name = b;
		home_colour = c;
	}

	public static void main(String[] args) {
		Home i = new Home(155588579, "Shanthnivasa", "Green");

		System.out.println(i.cost);
		System.out.println(i.home_name);
		System.out.println(i.home_colour);
	}
}
