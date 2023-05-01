class Cloth {
	int cost;
	String brand_name;
	String size;

	Cloth(int a, String b, String c) {
		cost = a;
		brand_name = b;
		size = c;
	}

	public static void main(String[] args) {
		Cloth i = new Cloth(187, "puma", "XL");

		System.out.println(i.cost);
		System.out.println(i.brand_name);
		System.out.println(i.size);
	}
}
