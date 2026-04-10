class OuterClass{

    static int a = 10;
    int b = 20;

    static class innerStaticclass{
        
        void display() {
            System.out.println(a);
            OuterClass ot = new OuterClass();
            System.out.println(ot.b);
        }
    }
}
public class Static_class {
    public static void main(String[] args) {
        OuterClass.innerStaticclass b = new OuterClass.innerStaticclass();
        b.display();
    }
}
