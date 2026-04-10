// 6. Write a program to find length of string and print second half of the string.[C] 

// public class c6 {
//     public static void main(String[] args) {

//         String str = "DarshanUniversity";

//         int length = str.length();
//         System.out.println("Length of string: " + length);

//         int mid = length / 2;

//         System.out.println("Second half: " + str.substring(mid));
//     }
// }


// or

class StringDemo {

    String str;

    // Method to set string
    void setString(String s) {
        str = s;
    }

    // Method to print length of string (manual counting)
    void printLength() {
        int count = 0;

        // Manual length count
        for (char c : str.toCharArray()) {
            count++;
        }

        System.out.println("Length of string: " + count);
    }

    // Method to print second half manually
    void printSecondHalf() {

        int length = str.length();
        int mid = length / 2;

        System.out.print("Second half: ");

        // Manual loop to print second half
        for (int i = mid; i < length; i++) {
            System.out.print(str.charAt(i));
        }
        
        System.out.println();
    }
}

public class c6 {
    public static void main(String[] args) {

        StringDemo obj = new StringDemo();

        obj.setString("DarshanUniversity");

        obj.printLength();
        obj.printSecondHalf();
    }
}

