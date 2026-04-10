// 1. Write a java Multithread program [A] 
//    i. Using Thread class. 
//    ii.Using Runnable Interface.

class MyThread extends Thread {
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread class: " + i);
        }
    }
}

class MyRunnable implements Runnable {
    
    @Override
    public void run() {
        for (int i = 101; i <= 105; i++) {
            System.out.println("Runnable interface: " + i);
        }
    }
}

public class A1{
    public static void main(String[] args){

        MyThread t1 = new MyThread();

        t1.start();


        // MyRunnable rn = new MyRunnable(); 

        // Thread t2 = new Thread(rn);

        // or

        Thread t2 = new Thread(new MyRunnable());

        t2.start();

       

    }
}