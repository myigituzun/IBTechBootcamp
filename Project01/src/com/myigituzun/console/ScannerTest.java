package com.myigituzun.console;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzun:");
        long l = scanner.nextLong();
        System.out.println("Sicim:");
        String s = scanner.next();
        System.out.println("İkişer:");
        double d = scanner.nextDouble();
        scanner.close();

        System.out.printf("Uzun: %10d Sicim: %-20s İkişer: %11.2f\n", l, s, d);
    }
}
