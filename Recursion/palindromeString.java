import java.util.*;

public class palindromeString {
    static boolean isPalindrome(int i, String str, int l) {
        if (i == l) {
            return true;
        }

        if (str.charAt(i) != str.charAt(l)) {
            return false;
        }

        return isPalindrome(i + 1, str, l - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        boolean checkPalindrome = isPalindrome(0, str, str.length() - 1);
        System.out.println(checkPalindrome);
    }
}
