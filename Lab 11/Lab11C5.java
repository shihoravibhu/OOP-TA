// 5. Write a Java program to create an interface Playable with a method play() that takes no 
// arguments and returns void. Create three classes Football, Volleyball, and Basketball 
// that implement the Playable interface and override the play() method to play the 
// respective sports. [C] 

interface Playable {
    public void play(); 
}

class Football implements Playable{
    
    public void play(){
        System.out.println("Play Football..");
    } 
}

class Volleyball implements Playable{

    public void play(){

        System.out.println("Play Volleyball..");
    }
    
}   

class Basketball implements Playable{

    public void play(){

        System.out.println("Play Basketball..");
    }

}

public class Lab11C5 {
    public static void main(String[] args) {

        Playable obj1 = new Football();
        Playable obj2 = new Volleyball();
        Playable obj3 = new  Basketball();

        obj1.play();
        obj2.play();
        obj3.play();
        
    }
}
