import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo {

    public static void main(String[] args) {

        try {

          FileWriter fw = new FileWriter("d.txt");
          BufferedWriter bw = new BufferedWriter(fw);

          String data = "heyyy\nGood Night";

          bw.write(data);
          
          bw.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}