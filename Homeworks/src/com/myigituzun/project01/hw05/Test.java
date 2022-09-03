package com.myigituzun.project01.hw05;

import java.util.Scanner;

import com.myigituzun.project01.hw03.Account;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("ID:");
        account.setAccountId(scanner.nextLong());

        System.out.println("Name:");
        account.setAccountName(scanner.next());

        System.out.println("Amount:");
        account.setAmountLocal(scanner.nextDouble());
        scanner.close();

        System.out.printf("ID: %d Name: %s Amount: %.2f\n", account.getAccountId(), account.getAccountName(), account.getAmountLocal());
    }
}
