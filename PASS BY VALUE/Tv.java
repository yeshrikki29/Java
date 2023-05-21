class Tv {
	public final char[] bn = null;
	int cost;
	String brand_name;
	String tv_colour;
	public char[] bc;

	Tv(int a, String b, String c) {
		cost = a;
		brand_name = b;
		tv_colour = c;
	}

	public static void main(String[] args) {
		Tv i = new Tv(1879579, "Lg", "red");

		System.out.println(i.cost);
		System.out.println(i.brand_name);
		System.out.println(i.tv_colour);
	}
}
