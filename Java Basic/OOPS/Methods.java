public class Methods {
    static int maxOf(int a, int b) {
        return a < b ? a : b;
    }

    static void maxOf(float d) {
        System.out.println(d);
    }

    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumber = 10;

        int result = maxOf(firstNumber, secondNumber);

        maxOf(5);

        System.out.println("The maximum number between " + firstNumber + " and " + secondNumber + " is: " + result);
    }
}
