package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to Check Prime or Not:");
        int n = scanner.nextInt();
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + "is not a prime number");
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;

                }
            }
            if (flag == 0) {
                System.out.println(n + "is a prime number");
            }
        }
    }
}

