class Homec {
	int cost;
	String home_name;
	String home_colour;

	Homec(int cost, String home_name, String home_colour) {
		this.cost = cost;
		this.home_name = home_name;
		this.home_colour = home_colour;
	}

	public static void main(String[] args) {
		Homec i = new Homec(155588579, "Shanthnivasa", "Green");

		System.out.println(i.cost);
		System.out.println(i.home_name);
		System.out.println(i.home_colour);
	}
}
