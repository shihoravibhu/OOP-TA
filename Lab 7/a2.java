// 2. Write a Java program to find the angle between the hour and minute hands.[A] 

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hour (1-12) : ");
        int hour = sc.nextInt();

        System.out.println("Enter Minute (0-59) : ");
        int minute = sc.nextInt();

        // 60 min -> 360
        // 1 min -> 360/60=6

        // 12 hours → 360°
        // 1 hour   → 30°
        // 1 minute → 30 / 60 = 0.5°

        // hour hand move 0.5 deg per minute and 30 deg per hour
        // minute hand move 6 deg per minute
        

        double angleHour = (hour * 30) + (minute * 0.5);
        double angleMinute = minute * 6;

        double angle = Math.abs(angleHour-angleMinute);

        angle = Math.min(angle , 360 - angle);

        System.out.println("Angle between hour and minute hand = " + angle + " deg");
        
        sc.close();
    }
    
}