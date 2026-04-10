abstract class Student{
    String nameStu;

    abstract public void show();
}

class TA extends Student{
    
    TA(String name)
    {
        super.nameStu=name;
    }

    @Override
    public void show()
    {
        System.out.println(nameStu);
    }
}

abstract public class demo {
    public static void main(String[] args) {
        
        Student[] obj=new Student[2];

        obj[0]=new TA("JAY");
        obj[1]=new TA("VIBHU");

        obj[0].show();
        obj[1].show();

    }
}
