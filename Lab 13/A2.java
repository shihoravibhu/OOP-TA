// 2. Write an application that executes two threads. One thread displays "Good Morning" 
// every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 
// milliseconds. Create the threads by implementing the Runnable interface. [A] 

class PrintGoodMorning implements Runnable{

    @Override
    public void run() {

        while (true) {
            
            System.out.println("Good Morning.");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }        
    }
}

class PrintGoodNight implements Runnable{

   @Override
    public void run() {

        while (true) {            
            
            System.out.println("Good Night.");
            
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class A2 {
    public static void main(String[] args) {

        // PrintGoodMorning p = new PrintGoodMorning();  

        // Thread t1 = new Thread(p);

        // or

        Thread t1 = new Thread(new PrintGoodMorning());
        
        t1.start();  
        
        Thread t2 = new Thread(new PrintGoodNight());        

        t2.start();
    }
}
