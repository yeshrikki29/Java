class Clothc {
	int cost;
	String brand_name;
	String size;

	Clothc(int cost, String brand_name, String size) {
		this.cost = cost;
		this.brand_name = brand_name;
		this.size = size;
	}

	public static void main(String[] args) {
		Clothc i = new Clothc(187, "puma", "XL");

		System.out.println(i.cost);
		System.out.println(i.brand_name);
		System.out.println(i.size);
	}
}
