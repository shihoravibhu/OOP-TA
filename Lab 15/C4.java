// // 4. Write a program to sort as per SPI from the List of students stored as ArrayList in 
// // previous program. [C]

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.Iterator;

// class Student3 {
//     int studentID;
//     String studentName;
//     int studentRollNo;
//     double studentSPI;

//     Student3(int studentID, String studentName, int studentRollNo, double studentSPI) {
//         this.studentID = studentID;
//         this.studentName = studentName;
//         this.studentRollNo = studentRollNo;
//         this.studentSPI = studentSPI;
//     }
// }

// // Comparator to sort by SPI
// class SpiComparator implements Comparator<Student3> {
//     @Override
//     public int compare(Student3 s1, Student3 s2) {
//         return Double.compare(s1.studentSPI, s2.studentSPI); // ascending
//     }
// }

// public class C4 {
//     public static void main(String[] args) {

//         ArrayList<Student3> ar = new ArrayList<>();

//         ar.add(new Student3(1, "Vi", 101, 9.6));
//         ar.add(new Student3(2, "Ri", 102, 9.16));
//         ar.add(new Student3(3, "Hi", 103, 9.06));

//         // Sorting by SPI
//         Collections.sort(ar, new SpiComparator());

//         // Display sorted list
//         Iterator<Student3> itr = ar.iterator();
//         while (itr.hasNext()) {
//             Student3 s = itr.next();
//             System.out.println(
//                 "ID: " + s.studentID +
//                 ", Name: " + s.studentName +
//                 ", Roll No: " + s.studentRollNo +
//                 ", SPI: " + s.studentSPI
//             );
//         }
//     }
// }

import java.util.ArrayList;

class Student3 {
    int studentID;
    String studentName;
    int studentRollNo;
    double studentSPI;

    Student3(int studentID, String studentName, int studentRollNo, double studentSPI) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentSPI = studentSPI;
    }
}

public class C4 {
    public static void main(String[] args) {

        ArrayList<Student3> ar = new ArrayList<>();

        ar.add(new Student3(1, "Vi", 101, 9.6));
        ar.add(new Student3(2, "Ri", 102, 9.16));
        ar.add(new Student3(3, "Hi", 103, 9.06));

        // Sort by SPI (ascending Order Ma Sort Kariyu)
        ar.sort((s1, s2) -> Double.compare(s1.studentSPI, s2.studentSPI));

        // Display
        for (Student3 s : ar) {
            System.out.println(
                "ID: " + s.studentID +
                ", Name: " + s.studentName +
                ", Roll No: " + s.studentRollNo +
                ", SPI: " + s.studentSPI
            );
        }
    }
}

