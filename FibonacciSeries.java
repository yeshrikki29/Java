import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        int previousNumber = 0, currentNumber = 1;

        System.out.print("Fibonacci Series up to " + limit + ": ");
        while (previousNumber <= limit) {
            System.out.print(previousNumber + ", ");
            int sum = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = sum;
        }

        scanner.close();
    }
}
