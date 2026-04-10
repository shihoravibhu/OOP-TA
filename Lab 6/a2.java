// 2. Create class Cube with attributes (height, width and depth with double datatype). 
// Implement getter() and setter() method to assign data for 2 cubes. Create method 
// volume() to calculate volume for 2 cubes. [A] 

class Cube {
    double height;
    double width;
    double depth;

    // for assign value
    void setter(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // display value
    void getter() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
    }

    double volume() {
        return height * width * depth;
    }
}

public class a2 {
    public static void main(String[] args) {

        Cube c1 = new Cube();
        Cube c2 = new Cube();

        c1.setter(5.0, 4.0, 3.0);
        c2.setter(7.5, 2.0, 6.0);

        // for cube 1
        System.out.println("Cube 1:");
        c1.getter();
        System.out.println("Volume: " + c1.volume());

        // for cube 2
        System.out.println("Cube 2:");
        c2.getter();
        System.out.println("Volume: " + c2.volume());
    }
}

