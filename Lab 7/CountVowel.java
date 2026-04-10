import java.util.Scanner;

class Sentence {
   int vowelA;
   int vowelE;
   int vowelI;
   int vowelO;
   int vowelU;

   public void isVowel() {

      Scanner sc = new Scanner(System.in);

      while (true) {

         System.out.println("enter sentence : ");
         String s1 = sc.nextLine();

         if (s1.equals("quit")) {
            break;
         }

         for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == 'A' || c == 'a') {
               vowelA++;
            } else if (c == 'O' || c == 'o') {
               vowelO++;
            } else if (c == 'I' || c == 'i') {
               vowelI++;
            } else if (c == 'U' || c == 'u') {
               vowelU++;
            } else if (c == 'E' || c == 'e') {
               vowelE++;   
            }
         }
         
      }
      System.out.println("vowel A = " + vowelA);
      System.out.println("vowel O = " + vowelE);
      System.out.println("vowel I = " + vowelI);
      System.out.println("vowel U = " + vowelO);
      System.out.println("vowel E = " + vowelU);
   }
}

public class CountVowel {
   public static void main(String[] args) {
      Sentence s1 = new Sentence();
      s1.isVowel();
   }
}