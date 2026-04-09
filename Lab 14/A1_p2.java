// 1. Write a program that counts number of characters, words, and lines in a file. Use 
// exceptions to check whether the file that is read exists or not. [A] 

import java.io.FileInputStream;

public class A1_p2 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("sample.txt");

            int i;
            int linecount = 0;
            int wordcount = 0;
            int charcount = 0;

            while ((i = fin.read()) != -1) {
                char ch = (char) i;     
                
                charcount++;

                if (ch == '\n') {
                    linecount++;
                }

                if (ch == ' ' || ch == '\n') {                 
              
                    wordcount++;                    
                    
                }

            }

            wordcount++; // last word ne count karva mate karne k last pachi \n k space nai hoi

            if (charcount > 0) {
                linecount++;   // same line mate k file ma jo khali ek j line che to ee line na last word pachi \n no hoi so we added after loop
            }

            System.out.println("Lines      : " + linecount);
            System.out.println("Characters : " + charcount);
            System.out.println("Words      : " + wordcount);

            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}