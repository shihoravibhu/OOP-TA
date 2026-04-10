// 5. Write a java program that implements a multi-thread application that has 
// three threads. First thread generates random integer every 1 second and if 
// the value is even, second thread computes the square of the number and 
// prints. If the value is odd, the third thread will print the value of cube of 
// the number. [B] 

class Random extends Thread {

    public void run() {

        while (true) {

            int num = (int) (Math.random() * 100);

            if (num % 2 == 0) {

                Even e1 = new Even(num);
                e1.start();

            } 
            else {

                Odd o = new Odd(num);
                o.start();

            }

            try {

                sleep(1000);

            } 
            catch (Exception e) {

                e.printStackTrace();
                
            }
        }
    }
}

class Even extends Thread {
    int num;

    Even(int num) {
        this.num = num;
    }

    public void run() {       
            
        System.out.println(this.num * this.num);
        
    }
}

class Odd extends Thread {
    int num;

    Odd(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println(this.num * this.num * this.num);
    }
}

public class B5 {
    public static void main(String[] args) {

        Random r1 = new Random();

        r1.start();

    }
}
