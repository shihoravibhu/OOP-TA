// 5. Write a program in java if number is less than 10 or greater than 50, it generate the 
// exception out of range. Else it displays the square of number. [C] 

class OutOfRangeException extends Exception {

    OutOfRangeException(String msg) {
        super(msg);
    }

}

public class C5 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 100);

        try {

            if ((num < 10) || (num > 50)) {

                throw new OutOfRangeException("Out Of Range..");

            }

            else {
                System.out.println((int) (Math.pow(num, 2)));
            }

        }

        catch (OutOfRangeException e) {

            System.out.println("msg  : " + e.getMessage());
            System.out.println("e : " + e);
            e.printStackTrace();

        } catch (Exception e) {

            System.out.println(e);

        }

    }
}
