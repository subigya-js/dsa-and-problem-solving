class Vehicle {
    int wheels;

    Vehicle(int noOfWheels) {
        wheels = noOfWheels;
    }
}

public class MyConstructor {
    // Creating the Constructor
    MyConstructor() {
        System.out.println("Object is now created");
    }

    public static void main(String[] args) {
        MyConstructor obj = new MyConstructor();

        Vehicle car = new Vehicle(8);
        Vehicle bike = new Vehicle(2);
        Vehicle auto = new Vehicle(3);

        System.out.println("Car has " + car.wheels + " wheels.");
        System.out.println("Bike has " + car.wheels + " wheels.");
        System.out.println("Auto has " + car.wheels + " wheels.");
    }
}
