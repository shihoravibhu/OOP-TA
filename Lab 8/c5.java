// 5. Write a Java program to create a class called House with private instance variables 
// address, numberOfRooms, and area. Provide public getter and setter methods to access 
// and modify these variables. Add a method called calculatePrice() that returns the price 
// of the house based on its area and a price per square meter.[C]

class House {

    // Private variables
    private String address;
    private int numberOfRooms;
    private double area;
    static double pricePerSquareMeter;
    
    // Getter and Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Getter and Setter for numberOfRooms
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    // Getter and Setter for area
    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    // Method to calculate price
    public double calculatePrice() {
        return area * pricePerSquareMeter;
    }
}

public class c5 {
    public static void main(String[] args) {

        House h1 = new House();

        // Setting values
        h1.setAddress("Rajkot, Gujarat");
        h1.setNumberOfRooms(4);
        h1.setArea(150.5);

        House.pricePerSquareMeter = 1500;
        
        // Calculating price
        double price = h1.calculatePrice(); // Example rate: ₹12,000 per sq meter

        // Display details
        System.out.println("Address: " + h1.getAddress());
        System.out.println("Rooms: " + h1.getNumberOfRooms());
        System.out.println("Area: " + h1.getArea() + " sq.m");
        System.out.println("Total Price: ₹" + price);
    }
}
