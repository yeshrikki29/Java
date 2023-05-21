class Tvc {
	int cost;
	String brand_name;
	String tv_colour;

	Tvc(int cost, String brand_name, String tv_colour) {
		this.cost = cost;
		this.brand_name = brand_name;
		this.tv_colour = tv_colour;
	}

	public static void main(String[] args) {
		Tvc i = new Tvc(1879579, "Lg", "red");

		System.out.println(i.cost);
		System.out.println(i.brand_name);
		System.out.println(i.tv_colour);
	}
}
