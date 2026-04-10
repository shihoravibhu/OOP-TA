class Table {

    synchronized void print(int n) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(n+" : " + n * i);
        }
    }
}

class MyThread2 extends Thread {
    Table t;
    int num;

    MyThread2(Table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.print(num);
    }
}

public class DemoOk {
    public static void main(String[] args) {

        Table t = new Table();

        MyThread2 t1 = new MyThread2(t, 5);
        MyThread2 t2 = new MyThread2(t, 10);

        t1.start();
        t2.start();
    }
}