package com.myigituzun.project01.hw03;

public class Test {
    public static void main(String[] args) {
        String line = "601;Kasa Hesabı; 23560";
        Account account = new Account();

        String[] newLine = line.split(";");

        account.setAccountId(Long.parseLong(newLine[0]));
        account.setAccountName(newLine[1]);
        account.setAmountLocal(Double.parseDouble(newLine[2]));
        System.out.println(account.toString());

        String builder = new StringBuilder().
        append(account.getAccountId()).append(";").
        append(account.getAccountName()).append(";").
        append(account.getAmountLocal()).append(";").
        toString();
        
        System.out.println("Line: " + builder);

    }
}
