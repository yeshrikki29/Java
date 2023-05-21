class Carc {
	int cost;
	String brand_name;
	String car_colour;

	Carc(int cost, String brand_name, String car_colour) {
		this.cost = cost;
		this.brand_name = brand_name;
		this.car_colour = car_colour;
	}

	public static void main(String[] args) {
		Carc i = new Carc(579, "mg", "gold");

		System.out.println(i.cost);
		System.out.println(i.brand_name);
		System.out.println(i.car_colour);
	}
}
