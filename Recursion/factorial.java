import java.util.*;

public class factorial {
    static int Nfactorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * Nfactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int fact = Nfactorial(n);

        System.out.println(n + "! = " + fact);
    }
}
