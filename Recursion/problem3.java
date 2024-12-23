// Print from N to 1.

public class problem3 {
    // static void printReverse(int n) {
    // if (n < 1) {
    // return;
    // }

    // System.out.println(n);
    // printReverse(n - 1);
    // }

    static void printReverse(int i, int n) {
        if (i < 1) {
            return;
        }

        System.out.println(i);
        printReverse(i - 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        // printReverse(n);
        printReverse(n, n);
    }
}
