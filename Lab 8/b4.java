// 4. Write a Java program to create a class called Area with a static final variable PI=3.14159. 
// Implement a method to calculate the area of a circle given its radius.[B] 

class Area {

    static final double PI = 3.14159;   // constant value

    // Method to calculate area of circle
    double circleArea(double radius) {
        return PI * radius * radius;
    }
}

public class b4 {
    public static void main(String[] args) {

        Area a = new Area();

        double r = 5;  // example radius

        double result = a.circleArea(r);

        System.out.println("Radius: " + r);
        System.out.println("Area of Circle = " + result);
    }
}