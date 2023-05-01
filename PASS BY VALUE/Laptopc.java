class Laptopc {
	int cost;
	String brand_name;
	String colour;

	Laptopc(int cost, String brand_name, String colour) {
		this.cost = cost;
		this.brand_name = brand_name;
		this.colour = colour;
	}

	public static void main(String[] args) {
		Laptopc i = new Laptopc(1879579, "Lg", "red");

		System.out.println(i.cost);
		System.out.println(i.brand_name);
		System.out.println(i.colour);
	}
}
