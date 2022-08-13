package com.bridgelabz.logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the values of N: ");
//        int n= scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1 + "\n" + num2);
        int num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
        System.out.println(num3);

    }
}
