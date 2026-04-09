// 2. Write a program to replace all “word1” by “word2” from a file1, and output is written 
// to file2 file and display the no. of replacement. [A] 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class A2_p2 {
    public static void main(String[] args) {
        
        try{

            // pela apde akhi file1 ne read karva mate

            FileInputStream fin = new FileInputStream("file1.txt");
            
            String data = "";

            int i = 0;

            while( (i = fin.read()) != -1){
                data += (char) i;
            }

            System.out.println("Data : " + data);

            fin.close();

            // biji file ma write karva mate 

            FileOutputStream fout = new FileOutputStream("file2.txt");

            int countWord = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Word1 : ");
            String word1 = sc.next();

            System.out.println("Enter Word2 : ");
            String word2 = sc.next();

            for(String w : data.split("\\s+")){  // split by \\s means single single white space and \\s+ means ek karta vadhare whitespace hoi toi split
                
                if(w.equals(word1)){
                    countWord++;
                }
            }

            data = data.replace(word1 , word2);

            fout.write(data.getBytes());

            System.out.println("Total Replacement : " + countWord);
            
            fout.close();

            sc.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
