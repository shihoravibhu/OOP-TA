class Complex{
   
   double real;
   double imag;

   Complex() {
      real = 0.0;
      imag = 0.0;
   }

   Complex(double real,double imag){
      this.real = real;
      this.imag = imag;
   }

   Complex addition(Complex c1,Complex c2) {
      this.real = c1.real+c2.real;
      this.imag = c1.imag+c2.imag;

      return this;
   }
}

public class Demo{
   public static void main(String[] args) {
      Complex c1 = new Complex(10.0,10.0);
      Complex c2 = new Complex(10.0,10.0);

      Complex c3 = new Complex();

      c3 = c3.addition(c1,c2);
      
      System.out.println(c3.real);
      System.out.println(c3.imag);
   }
}