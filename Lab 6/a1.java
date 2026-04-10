// 1. Create class Student with attributes (name: String, roll_no:int, SPI:double, 
// course: String). Implement getter() and setter() method to assign data for 3 
// students and display it.[A] 

class Student {
    String name;
    int roll_no;
    double SPI;
    String course;

    // Method to assign all values at once
    void setter(String name, int roll_no, double SPI, String course) {
        this.name = name;
        this.roll_no = roll_no;
        this.SPI = SPI;
        this.course = course;
    }

    // Method to display all values
    void getter() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("SPI: " + SPI);
        System.out.println("Course: " + course);
    }
}

public class a1 {
    public static void main(String[] args) {

        // Create 3 students
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Assign data
        s1.setter("Vibhu", 101, 9.5, "CSE");
        s2.setter("Amit", 102, 9.1, "IT");
        s3.setter("Riya", 103, 8.9, "CSE");

        // Display data
        s1.getter();
        s2.getter();
        s3.getter();
    }
}
