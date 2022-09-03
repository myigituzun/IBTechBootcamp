package com.myigituzun.project01.hw04;

import com.myigituzun.project01.hw03.Account;

public class Test {
    public static void main(String[] args) {
        String line = "601;Kasa Hesabı; 23560";
        AccountConverter converter = new AccountConverter();

        Account account = converter.parse(line);
        String newLine = converter.format(account);

        System.out.println(account.toString());
        System.out.println("Line: " + newLine);
    }
}
