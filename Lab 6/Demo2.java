import java.util.Scanner;

class Pizza{
   String size;
   String topping;
   int price;

   //setter
   public void setter(String sz,String top,int pz){
    size = sz;
    topping = top;
    price = pz;
   }

   //getter
   public void getter(){
      System.out.println("Size : " + size);
      System.out.println("Topping : " + topping);
      System.out.println("Price : " + price);
   }
   
}

public class Demo2 {
    public static void main(String[] args) {

      Pizza p1 = new Pizza();
      Scanner sc = new Scanner(System.in);
      p1.setter(sc.nextLine(), sc.nextLine(), sc.nextInt());
      p1.getter();

      sc.close();
        
    }
}
