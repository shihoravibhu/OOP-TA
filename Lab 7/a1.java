// 1. Write a program to create circle class with area function to find area of circle. [A]

import java.util.Scanner;

class Circle {

    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {

        return Math.PI * radius * radius;
    }
}

public class a1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle(15.6);

        System.out.println(c1.area());

        sc.close();

    }
    
}
