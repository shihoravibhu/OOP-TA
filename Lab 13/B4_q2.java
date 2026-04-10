// wait() and notify() are NOT calling methods 
// They are used for communication between threads
// (Must Be Remember) on the same object.

class Mobile {

    int stock = 500;  

    // Producer method (adds stock)
    public synchronized void produce() {

        // If stock is full, producer wait karse
        while (stock >= 1000) {
            try {
                wait();  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // ek vastu produce
        stock++;
        System.out.println(Thread.currentThread().getName() +
                " produced => Stock = " + stock);

        
        notifyAll();  // means k stock avi gyo che have tame consume kari sako cho so have consumer ma apde je olu wait lakhiyu tu ee wait puru thase ane ek vastu consume thai jasee
    }

    // Consumer method (removes stock etle mobile na stock reduce thasee)
    public synchronized void consume() {

        // If stock is empty then consumer wait karse
        while (stock <= 0) {
            try {
                wait();   
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // ek vastu mins stock mathi
        stock--;
        System.out.println(Thread.currentThread().getName() +
                " consumed => Stock = " + stock);

        
        notifyAll();
    }
}

// Producer thread
class Producer extends Thread {

    Mobile m;

    public Producer(Mobile m) {
        this.m = m;
        setName("Producer");
    }

    public void run() {
        while (true) {
            m.produce();
            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {

    Mobile m;

    public Consumer(Mobile m) {
        this.m = m;
        setName("Consumer");
    }

    public void run() {
        while (true) {
            m.consume();
            try {
                Thread.sleep(150);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class B4_q2 {
    public static void main(String[] args) {

        Mobile m = new Mobile();   

        Producer p = new Producer(m);
        Consumer c = new Consumer(m);

        p.start();
        c.start();
    }
}
