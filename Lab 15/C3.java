// 3. Write a program to demonstrate the use of ArrayList to store and display List of Student 
// class with StudentID, StudentName, StudentRollNo and StudentSPI. [C]

import java.util.ArrayList;
import java.util.Iterator;

class Student2 {
    int studentID;
    String studentName;
    int studentRollNo;
    double studentSPI;

    Student2(int studentID, String studentName, int studentRollNo, double studentSPI) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentSPI = studentSPI;
    }

}

public class C3 {
    public static void main(String[] args) {

        ArrayList<Student2> ar = new ArrayList<Student2>();

        ar.add(new Student2(1, "vi", 101, 9.6));
        ar.add(new Student2(2, "Ri", 102, 9.16));
        ar.add(new Student2(3, "Hi", 103, 9.06));

        Iterator<Student2> itr = ar.iterator(); // Must Be remember right side nu small ma iterator lakhvu

        while (itr.hasNext()) {
            Student2 s = itr.next();

            System.out.println("ID      : " + s.studentID);
            System.out.println("Name    : " + s.studentName);
            System.out.println("Roll No : " + s.studentRollNo);
            System.out.println("SPI     : " + s.studentSPI);
            System.out.println();
        }
        
        // or
        
        // for (int i = 0; i < ar.size(); i++) {
            //     Student2 s = ar.get(i);
            
            //     System.out.println(s.studentID);
            //     System.out.println(s.studentName);
            //     System.out.println(s.studentRollNo);
            //     System.out.println(s.studentSPI);
            //     System.out.println();
        // }

    }
}
