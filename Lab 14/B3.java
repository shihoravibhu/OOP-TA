// 3. Write an application that reads a file and counts the number of occurrences of digit 5. 
// Supply the file name as a command-line argument. [B]

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class B3 {
    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            int count = 0;

            String line;

            while ((line = br.readLine()) != null) {

                char[] abc = line.toCharArray();

                for(int i=0; i<abc.length; i++) {

                    if(abc[i] == '5') {
                        count++;
                    }
                    
                }
                // for (char ch : line.toCharArray()) {

                //     if ((ch - '0') == 5) {

                //         count++;

                //     }
                // }

            }
            System.out.println("Number of occurrences of digit 5: " + count);

            br.close();

        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
