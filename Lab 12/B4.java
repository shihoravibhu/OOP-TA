// 4. Write a Java program that divides two numbers.  If Num1 or Num2 were not an integer, 
// the program would throw a Number Format Exception. If Num2 were Zero, the program 
// would throw an Arithmetic Exception. Display appropriate message for each exception. 
// [B] 

// 1) Scanner.nextInt()
//    - Takes input directly as integer
//    - If user enters non-integer value (e.g. "abc")
//    - It throws InputMismatchException

// 2) Integer.parseInt()
//    - Converts String into integer
//    - If String is not a valid number (e.g. "abc")
//    - It throws NumberFormatException

public class B4 {
    public static void main(String[] args) {        

        try{

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);            
           
            int div = num1/num2 ;

            System.out.println(div);
            
        }

        catch(NumberFormatException e){
            System.out.println("NumberFormatException: Please enter valid integer values");
        }

        catch(ArithmeticException e){
            System.out.println("ArithmeticException: Cannot divide by zero");
        }
        
        
      
    }
}
