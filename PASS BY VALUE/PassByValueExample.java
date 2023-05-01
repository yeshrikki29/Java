public class PassByValueExample {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before method call: " + num);
        square(num);
        System.out.println("After method call: " + num);
    }

    public static void square(int n) {
        n = n * n;
    }

}