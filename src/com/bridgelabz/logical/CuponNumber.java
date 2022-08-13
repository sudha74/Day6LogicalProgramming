package com.bridgelabz.logical;

import java.util.Scanner;

public class CuponNumber {
    static void Cupon(int n) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int max = 1000000000;
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * max);
            StringBuilder sb = new StringBuilder();
            while (random > 0) {
                sb.append(chars[random % chars.length]);
                random /= chars.length;
            }
            String cuponcode = sb.toString();
            System.out.println("Cupon Code :" + cuponcode);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nmbers");
        int n = scanner.nextInt();
        Cupon(n);
    }
}
