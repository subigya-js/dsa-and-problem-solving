// Print Linearly from 1 to N

public class problem2 {
    static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        print(1, n);
    }
}
