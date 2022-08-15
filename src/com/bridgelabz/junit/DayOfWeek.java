package com.bridgelabz.junit;

import java.util.Scanner;

public class DayOfWeek {
    static void weekName(int dO){
        if (dO==0){
            System.out.println("Sunday");
        }else if (dO==1){
            System.out.println("Monday");
        }else if (dO==2){
            System.out.println("Tuesday");
        }else if (dO==3){
            System.out.println("Wednesday");
        }else if (dO==4){
            System.out.println("Thursday");
        }else if (dO==5){
            System.out.println("Friday");
        }else{
            System.out.println("Saturday");
        }

    }
    static void dayOfWeek(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a month");
        int m=scanner.nextInt();
        System.out.println("Enter a day");
        int d = scanner.nextInt();
        System.out.println("Enter a year");
        int y = scanner.nextInt();
        System.out.println();

        int yO=y-(14-m)/12;
        int x= yO+yO/4-yO/100+yO/400;
        int mO= m+12*((14-m)/12)-2;
        int dO=(d+x+31*mO/12)%7;
        weekName(dO);
    }
    public static void main(String[] args) {
        dayOfWeek();
    }
}
