class MyThread5 extends Thread{
    public void run() {
        while(true) {
            System.out.println("hello world");
            
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread6 implements Runnable {
    public void run() {
       while(true) {
            System.out.println("hello Student");
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}
public class Demo3 {
    public static void main(String[] args) {
        //thread class
        MyThread5 th = new MyThread5();
        th.start();

        //runnable

        MyThread6 th2 = new MyThread6();

        Thread th3 = new Thread(th2);
        th3.start();
    }
}
