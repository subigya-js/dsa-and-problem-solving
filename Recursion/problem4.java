// Print from 1 to N using backtracking

public class problem4 {
    static void f(int i, int n) {
        if (i < 1) {
            return;
        }

        f(i - 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 5;
        f(n, n);
    }
}
