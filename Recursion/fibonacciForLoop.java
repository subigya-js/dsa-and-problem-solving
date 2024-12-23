import java.util.Scanner;

public class fibonacciForLoop {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("\nThe first " + n + " fibonacci numbers are: ");

        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }
    }
}
