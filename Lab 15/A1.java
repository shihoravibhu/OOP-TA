// 1. Refine the student manager program to manipulate the student information from files 
// by using the BufferedReader and BufferedWriter. [A]

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Student{
    int id;
    String name;
    double spi;

    Student(int id , String name , double spi){
        this.id = id;
        this.name = name;
        this.spi= spi;
    }

    @Override
    public String toString(){
        return "Id : " + this.id + " Name : " + this.name + " SPI : " + this.spi + "\n";  
    }
}

public class A1{
    public static void main(String[] args){

        try{  // For writing
            BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));

            Student s1 = new Student(1,"vi", 9.5);
            Student s2 = new Student(2,"ri", 9.2);

            bw.write(s1.toString());
            bw.append(s2.toString());

            bw.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));

            String line;

            while((line = br.readLine()) != null){

                System.out.println(line);
            }

            br.close();

        } 
        catch (IOException e) {
           e.printStackTrace();
        }

    }
}