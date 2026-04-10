// 4. Write a program in Java to create an interface Car with moveForward, moveBackward, 
// moveLeft, moveRight, applyBreak methods, create a class named Swift and Thar which 
// implement the Car interface. [B] 

interface Car {

    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void applyBreak();
}

class Swift implements Car {

    public void moveForward() {
        System.out.println("Swift is moving forward");
    }

    public void moveBackward() {
        System.out.println("Swift is moving backward");
    }

    public void moveLeft() {
        System.out.println("Swift is turning left");
    }

    public void moveRight() {
        System.out.println("Swift is turning right");
    }

    public void applyBreak() {
        System.out.println("Swift brake applied");
    }
}

class Thar implements Car {

    public void moveForward() {
        System.out.println("Thar is moving forward");
    }

    public void moveBackward() {
        System.out.println("Thar is moving backward");
    }

    public void moveLeft() {
        System.out.println("Thar is turning left");
    }

    public void moveRight() {
        System.out.println("Thar is turning right");
    }

    public void applyBreak() {
        System.out.println("Thar brake applied");
    }
}

public class Lab11B4 {
    public static void main(String[] args) {

        Car c1 = new Swift();   // etle k reference parent interface no jyare obj child class no
        Car c2 = new Thar();

        c1.moveForward();
        c1.moveLeft();
        c1.applyBreak();

        System.out.println();

        c2.moveForward();
        c2.moveRight();
        c2.applyBreak();
    }
}
