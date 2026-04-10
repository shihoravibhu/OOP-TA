// 1. Write a program that illustrates interface inheritance. Interface A is extended by A1 and 
// A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant 
// and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
// Each method displays one of the constants. [A] 

interface A{

    // int x = 10;        // variable   : public static final  (by default lagi j jai must be remember)

    // void show();       // methods    : public abstract

    int a = 1;
    
    public int displaya();
}

interface A1 extends A{
    
    int b = 2;

    public int displayb();
}

interface A2 extends A{
    
    int c = 3;

    public int displayc();
}

interface A12 extends A1,A2{
    
    int d = 4;
    public int displayd();
}

class B implements A12{

    public int displaya(){
        return a;
    }
    public int displayb(){
        return b;
    }
    public int displayc(){
        return c;
    }
    public int displayd(){
        return d;
    }
}

public class Lab11A1{
     public static void main(String[] args) {
        
        B obj = new B();

        System.out.println(obj.displaya());
        System.out.println(obj.displayb());
        System.out.println(obj.displayc());
        System.out.println(obj.displayd());


    }
}