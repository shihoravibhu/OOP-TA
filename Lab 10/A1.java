// 1. The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
// Write a java program that demonstrates how to establish this class hierarchy. Declare 
// one instance variable of type String that indicates the color of a vegetable. Create and 
// display instances of these objects. Override the toString() method of object to return a 
// string with the name of vegetable and its color. [A]

abstract class Vegetable {
    
    String vegetableColor;
    
    abstract public String toString();    
    
}

class Potato extends Vegetable{

    Potato(){
        super.vegetableColor = "Yellow" ;
    }    

    public String toString(){
        
        return "Vegetable Name : Potato " + "Vegetable Color : "  + super.vegetableColor ;
    }
}

class Bringal extends Vegetable{

    Bringal(){
        super.vegetableColor = "Violet";
    }    

    public String toString(){
        
        return "Vegetable Name : Bringle " + "Vegetable Color : "  + super.vegetableColor ;
    }
    
} 

class Tomato extends Vegetable{

    Tomato(){
        super.vegetableColor = "Red" ;
    }
    
    public String toString(){
        
        return "Vegetable Name : Tomato " + "Vegetable Color : "  + super.vegetableColor ;
    }
    
}


public class A1 {
     public static void main(String[] args) {

        // Vegetable v = new Vegetable() ;       Abstarct Class No Object No Bane   
        
        Vegetable v1 = new Potato();
        Vegetable v2 = new Bringal();
        Vegetable v3 = new Tomato();

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }
    
}