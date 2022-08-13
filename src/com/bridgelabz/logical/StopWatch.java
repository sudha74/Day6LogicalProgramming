package com.bridgelabz.logical;

import java.util.Scanner;

public class StopWatch {
    static long startTimer = 0;
    static long stopTimer = 0;
    static long elapsed;

    static void start() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    static void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println("StopTimer is : " + stopTimer);
    }

    static long getElapsed() {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to start the time");
        scanner.nextInt();
        start();
//        System.out.println();
        System.out.println("Press 2 to stop the time");
        scanner.nextInt();
        stop();
        long l = getElapsed();
        System.out.println("Total Time Elapsed(in millisec) is :" + 1);
        System.out.println("Converting millisec to seconds:" + (1 / 100) + "sec");

    }
}
