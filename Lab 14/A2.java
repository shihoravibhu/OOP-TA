// 2. Write a program to replace all “word1” by “word2” from a file1, and output is written 
// to file2 file and display the no. of replacement. [A] 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word1 : ");
        String word1 = sc.next();

        System.out.println("Enter Word2 to Replace : ");
        String word2 = sc.next();

        try {

            BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));

            int count = 0;
            String line;

            while((line = br.readLine()) != null){

                String[] words = line.trim().split("\\s");

                for(int i = 0 ; i < words.length ; i++){

                    if(words[i].equals(word1)){
                        count++;
                    }

                }
                
                line = line.replace(word1,word2);

                bw.write(line+"\n");
            }


            System.out.println("Total Replacement : " + count);

            br.close();
            bw.close();
            
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
        catch (IOException e) {

            e.printStackTrace();
        }
        finally{
            sc.close();
        }
        
    }
}
