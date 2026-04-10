class tim{
    int h , m , s;

    tim(int h , int m ,int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    tim add(tim t2){

        tim t3 = new tim(0, 0, 0);

        t3.h += this.h + t2.h;
        t3.m += this.m + t2.m;
        t3.s += this.s + t2.s;

        if(t3.s >= 60){
            t3.m += t3.s / 60;
            t3.s = t3.s % 60;
        }  

        if(t3.m >= 60){
            t3.h += t3.m / 60;
            t3.m = t3.m % 60;
        }

        t3.h = t3.h % 24;

        return t3;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        
        tim t1 = new tim(1, 55, 0);
        tim t2 = new tim(0, 4, 60);

        tim t3 = t1.add(t2);

        System.out.println(t3.h+" : "+ t3.m + " : " + t3.s);
    }
}
