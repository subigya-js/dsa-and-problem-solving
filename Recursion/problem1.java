// Print name N times

public class problem1 {
    static void printName(int n) {
        if (n < 1) {
            return;
        }

        System.out.println("Gaurav Subedi");
        printName(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printName(n);
    }
}
