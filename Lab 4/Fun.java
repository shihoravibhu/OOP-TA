public class Fun {

    public int sum(int c , int d) {//formal

        return c+d;
      
    }
    public static void main(String[] args) {
       
        Fun f = new Fun();

        int a = 9 , b = 10;
        
       int s = f.sum(a,b);//actual

       System.out.println(s);

        
    }  
}
