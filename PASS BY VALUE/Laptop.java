class Laptop {
	int cost;
	String brand_name;
	String colour;

	Laptop(int a, String b, String c) {
		cost = a;
		brand_name = b;
		colour = c;
	}

	public static void main(String[] args) {
		Laptop i = new Laptop(1879579, "Lg", "red");

		System.out.println(i.cost);
		System.out.println(i.brand_name);
		System.out.println(i.colour);
	}
}
