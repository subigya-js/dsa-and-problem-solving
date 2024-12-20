class Numbers {
    int a;
    int b;
}

public class ObjectSwap {
    static void swap(Numbers num) {
        int temp;
        temp = num.a;
        num.a = num.b;
        num.b = temp;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.a = 10;
        num.b = 20; 

        System.out.println("Two numbers before swapping are: " + num.a + " and " + num.b);

        swap(num);
        System.out.println("Two numbers after swapping are: " + num.a + " and " + num.b);
    }
}
