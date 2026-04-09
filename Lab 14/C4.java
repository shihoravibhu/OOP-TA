// 4. Create a class called Student. Write a student manager program to manipulate the 
// student information from files by using FileInputStream and FileOutputStream. [C]

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Student {
    int id;
    String name;
    double spi;

    Student(int id, String name, double spi) {
        this.id = id;
        this.name = name;
        this.spi = spi;
    }
}

public class C4 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Vibhu", 9.8);
        Student s2 = new Student(102, "Jay", 9.8);
        Student s3 = new Student(103, "Mohit", 9.8);

        // Pela Student No Data Write 

        try {
            
            FileOutputStream fout = new FileOutputStream("student.txt");

            String data = s1.id + " , " + s1.name + " , " + s1.spi + "\n" +
                          s2.id + " , " + s2.name + " , " + s2.spi + "\n" +
                          s3.id + " , " + s3.name + " , " + s3.spi + "\n";

            fout.write(data.getBytes());
            fout.close();

            System.out.println("Student data written to file");

        } 
        catch (IOException e) {
            System.out.println("Error while writing file");
        }

        // And Je Data Apde Write Kairio Tene Read

        try {
            FileInputStream fin = new FileInputStream("student.txt");

            int ch;

            System.out.println("\nStudent Data from File:");

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

            fin.close();

        } 
        catch (IOException e) {
            System.out.println("Error while reading file");
        }
    }
}