// 3. Write a program to create a custom exception named AgeException, get the age of 
// the user from command prompt (terminal) and if age is less than 18 it should throw 
// AgeException, also handle this exception in main method. [A] 

class AgeException extends Exception{

    AgeException(String msg){
        super(msg);
    }

}

public class A3 {
    public static void main(String[] args) {

        // Command Prompt Thi Age Enter Karvi     
        
        try{
            
            int age = Integer.parseInt(args[0]);

            if(age < 18){
                throw new AgeException("You're Below 18.");
            }

            System.out.println("Age is valid. Access granted.");
        }
        catch(AgeException e){

            System.out.println(e.getMessage());

        }
        
    }
}
