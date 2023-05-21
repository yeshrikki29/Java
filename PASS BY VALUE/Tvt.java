class Tvt {
    int cost;
    String bn;
    String bc;

    Tvt(int cost, String bn, String bc) {
        this.cost = cost;
        this.bn = bn;
        this.bc = bc;
    }

    public static void main(String[] y) {
        Tvt t = new Tvt(4598, "ABC", "XYZ");
        System.out.println(t.cost);
        System.out.println(t.bn);
        System.out.println(t.bc);
    }
}
