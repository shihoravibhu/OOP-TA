class Student{

    static int count=0;
    String name;
    int age;

    static{
        System.out.println("student static block called");
    }

    Student() {
        count++;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public static void printCount() {
        
        System.out.println(count);
    }
}
public class demo {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student("jay",19);

        System.out.println(Student.count);
    }
}


