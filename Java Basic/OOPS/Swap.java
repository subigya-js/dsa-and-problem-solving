//This is the representaiton of Pass by Value in methods;

public class Swap {

    static void swap(int a, int b) {
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers after swapping are: a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Numbers before swapping are: a = " + a + " b = " + b);

        swap(a, b);
    }
}
