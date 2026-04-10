// 1. Write a program to add two different Time class’s objects. Time class contains 3 
// fields hours, Minute and Seconds. (Take input from user and assume user will 
// always enter a valid data, e.g. if Time1 is 02:55:55 and Time2 is 03:07:10 then 
// result is 06:03:05) [A] 

class Time {
    
    int hour;
    int minute;
    int second;

    // Constructor to initialize hour and minute
    Time(int hour, int minute , int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to add two Time objects
    static Time add(Time t1,Time t2) {
        int newHour = t2.hour + t1.hour;
        int newMinute = t2.minute + t1.minute;
        int newSecond = t2.second + t1.second;

        if(newSecond >= 60){
            newMinute += newSecond / 60;
            newSecond = newSecond % 60;
        }

        // If minutes exceed 60, convert to hour
        if (newMinute >= 60) {
            newHour += newMinute / 60;
            newMinute = newMinute % 60;
        }

        Time t3 = new Time(newHour, newMinute,newSecond);
        

        return t3;
    }

    // Method to display time
    void display() {
        System.out.println(this.hour + " hr : " + this.minute + " min : " + this.second);
    }

}

public class A1{   
    public static void main(String[] args) {
        Time t1 = new Time(4, 50,55);
        Time t2 = new Time(1, 30,56);
    
        Time t3 = Time.add(t1,t2);
    
        System.out.print("Time 1 = ");
        t1.display();
    
        System.out.print("Time 2 = ");
        t2.display();
    
        System.out.print("Addition = ");
        t3.display();
    }
}
