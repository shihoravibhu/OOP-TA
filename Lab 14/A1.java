// 1. Write a program that counts number of characters, words, and lines in a file. Use 
// exceptions to check whether the file that is read exists or not. [A] 

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A1 {
    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("sample.txt");

            BufferedReader br = new BufferedReader(fr);

            // or

            // BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            int countChar = 0, countWord = 0, countLine = 0;
            String line;

            while ((line = br.readLine()) != null) {

                countChar += line.length();

                // countWord += line.trim().split("\\s").length;

                // or

                countWord += line.trim().split("\\s").length;
                
                // countWord += words.length;

                countLine++;                 
                
                
            }

            System.out.println("Characters : " + countChar);
            System.out.println("Words      : " + countWord);
            System.out.println("Lines      : " + countLine);

            br.close();

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found");

        } 
        catch (IOException e) {

            e.printStackTrace();
            
        } 
        

    }
}