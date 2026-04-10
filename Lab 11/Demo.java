interface Ok{

    // int x = 10;        // variable   : public static final  (by default lagi j jai must be remember)

    // void show();       // methods    : public abstract

    int a = 1;
    
    void display();
}
class Hey implements Ok{
    public void display() {
        System.out.println("sub class");
    }
}
public class Demo {
    public static void main(String[] args) {
        
    }
}
