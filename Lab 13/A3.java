// 3. Write a program to create two threads, one thread will print odd numbers and second 
// thread will print even numbers between 1 to 20 numbers. [A] 

class Odd extends Thread{

    public void run(){

        for(int i=3 ; i<20 ; i+=2){
            System.out.println("Odd : " + i);
        }
    }
}
class Even extends Thread{

    public void run(){

        for(int i=2 ; i<20 ; i+=2){
            System.out.println("Even : " + i);
        }
    }
}

public class A3 {
    public static void main(String[] args) {

        Odd od = new Odd();
        Even evn = new Even();
        
        od.start();

        try {
            od.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        evn.start();        
        
    }
}
