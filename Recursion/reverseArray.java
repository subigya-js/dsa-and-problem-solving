
import java.util.*;

public class reverseArray {
    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Using Two Pointer
    // static void reverse(int arr[], int l, int r) {
    // if (l == r) {
    // return;
    // }

    // swap(arr, l, r);
    // reverse(arr, l + 1, r - 1);
    // }

    // Using Single Pointer
    static void reverse(int i, int arr[], int n) {
        if (i == n / 2) {
            return;
        }

        swap(arr, i, n - i - 1);
        reverse(i + 1, arr, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter array elements: ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nThe original array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Using Two Pointer
        // reverse(arr, 0, n - 1);

        // Using Single Pointer
        reverse(0, arr, n);
        System.out.println("\nThe reverse of original array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
