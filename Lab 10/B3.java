// 3. Write a Java program to create an abstract class Vehicle with abstract methods 
// startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend 
// the Vehicle class and implement the respective methods.

abstract class Vehicle {

    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started with self start.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class B3 {
    public static void main(String[] args) {

        Vehicle v;

        // By Dynamic Method Dispatch 
        v = new Car();
        v.startEngine();
        v.stopEngine();

        System.out.println();

        v = new Motorcycle();
        v.startEngine();
        v.stopEngine();
    }
}
