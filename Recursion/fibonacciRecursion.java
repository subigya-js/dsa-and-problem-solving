import java.util.Scanner;

public class fibonacciRecursion {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = sc.nextInt();

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }
}
