package Patterns;

public class Pattern7 {
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("-");
            }

            for (int k = 0; k < ((2 * i) + 1); k++) {
                System.out.print("*");
            }

            for (int l = 0; l < n - i - 1; l++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }

            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("-");
            }

            for (int k = 0; k < ((2 * i) + 1); k++) {
                System.out.print("*");
            }

            for (int l = 0; l < n - i - 1; l++) {
                System.out.print("-");
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("-");
            }

            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < n - k - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < n - k - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                }

                else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }

            space -= 2;
            System.out.println();
        }
    }

    static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        int num = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (num + j));
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            int num = 65;
            for (int j = n; j > i; j--) {
                System.out.print((char) (num++) + " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        int val = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (val + i) + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        int val = 65;
        for (int i = 0; i < n; i++) {
            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Character
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (val + j));
            }

            // Print the second half of the pattern (decreasing characters)
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) (val + j));
            }

            // Space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            int base = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (base + n - j - 1) + " ");
            }

            System.out.println();
        }
    }

    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) || (i == 0 || i == n - 1)) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if ((i == 0 || i == n + 1) || (j == 0 || j == n + 1)) {
                    System.out.print(n);
                }

                else {
                    for(int k = 1; k < n+1; k++) {
                        if(k == i) {
                            System.out.print(n-k);
                        }
                    }
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern7(5);
        // pattern8(5);
        // pattern9(5);
        // pattern10(3);
        // pattern11(3);
        // pattern12(4);
        // pattern13(7);
        // pattern14(5);
        // pattern15(5);
        // pattern16(5);
        // pattern17(5);
        // pattern18(3);
        // pattern21(5);
        pattern22(3);
    }
}
