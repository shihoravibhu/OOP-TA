// 3 Demonstrate the use of Super Keyword. [A] 

// By Super keyword......
// We Can call Constructor,Function,Variable Of Base Class 

class Base {

    int a = 101 ;

    public Base() {
        System.out.println("Base (Parent Class) Constructor");
    }

    public void display() {
        System.out.println("Heyy..(From Base Class)");
    }
}

class Derived extends Base {

    public Derived() {
        super();                             
        System.out.println("Derived (Chlid Class) Constructor");
    }

    public void display() {
        super.display();                      
        System.out.println("Hello..(From Derived Class)");

        System.out.println(super.a);         
    }
}

public class A3 {
    public static void main(String[] args) {

        Derived d1 = new Derived();

        d1.display();

    }
}
