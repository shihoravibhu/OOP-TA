abstract class Animal {
    public abstract void eat();
    public abstract void fly();
    public abstract void walk();
}

abstract class Bird extends Animal{
    public void eat() {
        System.out.println("bird eating");
    }
}
class Chakli extends Bird{
    public void fly() {
        System.out.println("bird flying");
    }
    public void walk() {
        System.out.println("bird walking");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        
    }
}
