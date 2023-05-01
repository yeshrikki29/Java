class Car {
	int cost;
	String brand_name;
	String car_colour;

	Car(int a, String b, String c) {
		cost = a;
		brand_name = b;
		car_colour = c;
	}

	public static void main(String[] args) {
		Car i = new Car(579, "mg", "gold");

		System.out.println(i.cost);
		System.out.println(i.brand_name);
		System.out.println(i.car_colour);
	}
}
