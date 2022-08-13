package com.bridgelabz.logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n / 2; i++) {
            if (n / i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        if (sum != n) {
            System.out.println("Not a Perfect Number");
        } else {
            System.out.println(" Perfect Number");
        }

    }
}


