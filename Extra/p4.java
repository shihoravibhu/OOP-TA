// 4) Generate Random no. between 1 to 100 using Math.random().

public class p4 {
    public static void main(String[] args) {

        // Math.random() → 0.0 to 0.999

        // *100 → 0 to 99
        // +1 → 1 to 100

        int num = (int)(Math.random() * 100) + 1;

        System.out.println("Random Number: " + num);
        
    }
}
