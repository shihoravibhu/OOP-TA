// 3) Implement all the methods of Math Class.

public class p3 {
    public static void main(String[] args) {
        
        // Constants
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);

        // Basic operations
        System.out.println("Abs(-10): " + Math.abs(-10));
        System.out.println("Max(5, 9): " + Math.max(5, 9));
        System.out.println("Min(5, 9): " + Math.min(5, 9));

        // Power and roots
        System.out.println("Pow(2, 3): " + Math.pow(2, 3));
        System.out.println("Sqrt(16): " + Math.sqrt(16));
        System.out.println("Cbrt(27): " + Math.cbrt(27));

        // Rounding
        System.out.println("Ceil(5.3): " + Math.ceil(5.3));
        System.out.println("Floor(5.9): " + Math.floor(5.9));
        System.out.println("Round(5.5): " + Math.round(5.5));
        
        // Trigonometric
        System.out.println("Sin(90°): " + Math.sin(Math.toRadians(90)));
        System.out.println("Cos(0°): " + Math.cos(Math.toRadians(90)));
        System.out.println("Tan(45°): " + Math.tan(Math.toRadians(45)));

        // Inverse trigonometric
        System.out.println("Asin(1): " + Math.asin(1));
        System.out.println("Acos(0): " + Math.acos(0));
        System.out.println("Atan(1): " + Math.atan(1));
        

    }
}