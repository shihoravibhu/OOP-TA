// 3. Write an application that reads a file and counts the number of occurrences of digit 5. 
// Supply the file name as a command-line argument. [B]

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class B3_p2 {
    public static void main(String[] args) {

        try {

            FileInputStream fin = new FileInputStream(args[0]);

            int count = 0;

            int i = fin.read();

            // 5 ni acci Value 53 che char ma no convert karvu hoi to i == 53 lakhvanu

            while(i != -1){

                if ((char)i == '5') {
                
                    count++;
                    
                }

                i = fin.read();

            }
            System.out.println("Number of occurrences of digit 5: " + count);

            fin.close();

        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
