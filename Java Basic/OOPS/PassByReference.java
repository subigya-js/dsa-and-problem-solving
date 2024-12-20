class Dog {
    int legs;
};

public class PassByReference {
    static void swap(Dog a, Dog b) {
        Dog temp;
        temp = a;
        a = b;
        b = temp;
    }

    static void changeDog(Dog dog) {
        dog.legs = 6;
    }

    public static void main(String[] args) {
        Dog c = new Dog();
        c.legs = 4;

        Dog d = new Dog();
        d.legs = 5;

        swap(c, d);
        System.out.println(c.legs + "," + d.legs);

        Dog a = new Dog();
        a.legs = 5;

        changeDog(a);

        System.out.println(a.legs);
    }
}
