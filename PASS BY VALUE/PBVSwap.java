public class PBVSwap {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swap(num1, num2);
        System.out.println("num1 = " + num1); // Output: num1 = 10
        System.out.println("num2 = " + num2); // Output: num2 = 20
    }
    
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}