// Print how many times (count) recursion occured.

public class recursionBasis {
    static int count = 0;

    static void print() {
        if (count == 3) {
            return;
        }

        System.out.println(count++);
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
