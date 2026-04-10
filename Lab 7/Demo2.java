class Circle2{

    double radius ;

    // Non-Perameterised
    Circle2(){
        this.radius = 10;
    }
    
    // Perameterised
    Circle2(double radius){
        this.radius = radius;
    }

    // Copy
    Circle2(Circle2 c){
        this.radius = c.radius;
    }

    
    // Area 
    double area(){
        return Math.PI * this.radius * this.radius;
    }

}

public class Demo2 {
    public static void main(String[] args) {
        
        // Circle2 c = new Circle2();

        Circle2 c = new Circle2(7);

        // Circle2 c = new Circle2(7);
        // Circle2 c2 = new Circle2(c);

        System.out.println(c.area());

        // System.out.printf("%.2f",c.area());
  
        
    }
}
