import java.util.Scanner;

public class Basis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = { 1, 2, 3, 5, 2, 1, 8 };

        // Check how many times a specific number is repeated.
        System.out.printf("Enter the number: ");
        int val = sc.nextInt();

        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i] == val) {
                count ++;
            }
        }

        System.out.println(val + " is repeated for: " + count + " times");
    }
}