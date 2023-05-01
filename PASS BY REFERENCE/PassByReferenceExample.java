public class PassByReferenceExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before method call: " + sb);
        appendString(sb);
        System.out.println("After method call: " + sb);
    }

    public static void appendString(StringBuilder str) {
        str.append(" World");
    }

}