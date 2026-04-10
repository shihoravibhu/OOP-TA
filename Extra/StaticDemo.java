// 5) Implement all four static concept in a program.

class StaticDemo {

    static int count = 0;   // static variable

    static {                // static block
        System.out.println("Static Block Executed");
    }

    StaticDemo() {
        count++;
    }

    static void display() {  // static method
        System.out.println("Object count: " + count);
    }

    static class Inner {     // static nested class
        void show() {
            System.out.println("Inside Static Nested Class");
        }
    }

    public static void main(String[] args) {

        // StaticDemo s1 = new StaticDemo();
        // StaticDemo s2 = new StaticDemo();

        StaticDemo.display();

        StaticDemo.Inner obj = new StaticDemo.Inner();
        obj.show();
    }
}
