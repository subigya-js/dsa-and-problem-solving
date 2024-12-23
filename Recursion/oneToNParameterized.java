// Sum of numbers from 1 to N
// This is using Parameterised Approach

public class oneToNParameterized {
    static int sum(int n, int sum) {
        if (n < 1) {
            return sum;
        }

        return sum(n - 1, sum + n);
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sum(n, 0);

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}
