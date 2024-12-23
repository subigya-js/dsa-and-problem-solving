// Print N to 1 using backtracking

public class problem5 {
    static void f(int i, int n) {
        if (i > n) {
            return;
        }

        f(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 5;
        f(1, n);
    }
}
