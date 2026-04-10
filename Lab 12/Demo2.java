class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}

public class Demo2 {
    public static void method1() throws CustomException{
        method2();
    }
    public static void method2() throws CustomException{
        int a = 10;
        int b = 2;
        
            if(b == 2) {
                throw new CustomException("2 se divide nahi hoga.");
            }
            System.out.println(a/b);
        
    }
    public static void main(String[] args) throws CustomException{
        method1();
        System.out.println("hello");
    }
}