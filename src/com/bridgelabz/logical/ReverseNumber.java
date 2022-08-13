package com.bridgelabz.logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();
        int rev = 0;
        int n;
        System.out.println("Numbers before Reversed : " + num);
        while (num != 0) {
            n = num / 10;
            rev = rev * 10 + n;
            num = num / 10;
        }
        System.out.println("Numbers after Reversed : " + rev);

    }
}
