// 5. Design a class named MyPoint to represent a point with x- and y-coordinates. The 
// class contains: 
// The data fields x and y that represent the coordinates with getter methods. 
// 1. a no-arg constructor that creates a point (0, 0). 
// 2. a constructor that constructs a point with specified coordinates. 
// 3. a method named distance that returns the distance from this point to a specified 
// point of the MyPoint type. 
// 4. a method named distance that returns the distance from this point to another point 
// with specified x- and y-coordinates.Create a class named ThreeDPoint to model a 
// point in a three-dimensional space. Let ThreeDPoint be derived from MyPoint with 
// following additional features: 
// 1. A data fields named z that represents the z-coordinate. 
// 2.    A no-arg constructor that creates a point (0, 0, 0). 
// 3.   A constructor that constructs a point with three specified coordinates. 
// 4.   A get method that returns the z value. 
// 5.   Override the distance method to return the distance between two points in the 
// three-dimensional space. Write a program that creates two points (0, 0, 0) and (10, 
// 30, 25.5) and display the distance between the two points. [C] 

class Mypoint{

    double x ;
    double y ;

    public Mypoint(){
        this.x = 0 ;
        this.y = 0 ;
    }

    public Mypoint(double x , double y){
        this.x = x ;
        this.y = y ;
    }

    public double distance(Mypoint temp){
        return Math.sqrt(Math.pow((this.x-temp.x), 2)+Math.pow(this.y-temp.y, 2));
    }
    public double distance(int x ,int y){
        return Math.sqrt(Math.pow((this.x-x), 2)+Math.pow(this.y-y, 2));
    }

}

class ThreeDpoint extends Mypoint{

    double z ;

    public ThreeDpoint(){
        this.z=0;
    }

    public ThreeDpoint(double x,double y,double z){
        super(x,y);
        this.z=z;     

    }

    public double getz(){

        return this.z;

    }

    public double distance(ThreeDpoint temp){

        return Math.sqrt(Math.pow((this.x-temp.x), 2)+Math.pow(this.y-temp.y, 2)+Math.pow(this.z-temp.z, 2));

    }


}

public class C5 {
     public static void main(String[] args) {

        ThreeDpoint d1 = new ThreeDpoint(0,0,0);
        ThreeDpoint d2 = new ThreeDpoint(10,30,25.5);

        System.out.println(d1.distance(d2));
        

    }
}
