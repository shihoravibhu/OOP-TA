// 2. WAP that counts the number of objects created using static. [A] 

class Object{

    static int sumOfTotalObject ;

    public Object(){
        sumOfTotalObject++;
    }

    public static void Sum(){

        // System.out.println("number of "+sumOfTotalObject+" objects created ");

        System.out.println("number of "+ sumOfTotalObject+" objects created ");     

        // Koi Pan Static Variable Ne Apdee Sada Variable Ni Jem this.
        // Karine Access No Kari Sakiye Static Variable Access Karva Mate Class_Name. Karvu Pade

        // Static Method Cannot Uses Non Static Variable
        // Non Static Method Uses Both Type Of Variable Static And NonStatic
        
    }

}

public class a2 {
    public static void main(String[] args) {

        Object o1 = new Object() ;
        Object o2 = new Object() ;
        Object o3 = new Object() ;
        Object o4 = new Object() ;

        Object.Sum();

        // System.out.println(o1.sumOfTotalObject);
        
    }
    
}
