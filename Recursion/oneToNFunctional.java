// Sum of numbers from 1 to N
// This is using functional approach

public class oneToNFunctional {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sum(n);

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}
