// 2) WAP Java program to convert user input to alternative uppercase & lowercase String.
//    e.g: input:Darshan    Output: DaRsHaN

public class p2{
    public static void main(String[] args) {

        String str = "Darshan";

        String s = "";

        for(int i=0 ; i<str.length() ; i++){

            char ch = str.charAt(i);

            if(i % 2 == 0){
                s += (ch+"").toUpperCase();

                // or

                //  s += Character.toUpperCase(ch);
            }
            else{                
                s += (ch+"").toLowerCase();
            }
        }

        System.out.println(s);
    }
}