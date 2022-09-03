package com.myigituzun.project01.hw04;

import com.myigituzun.project01.hw03.Account;

public class AccountConverter {
    
    public Account parse(String line){
        Account account = new Account();
        String[] newLine = line.split(";");

        account.setAccountId(Long.parseLong(newLine[0]));
        account.setAccountName(newLine[1]);
        account.setAmountLocal(Double.parseDouble(newLine[2]));

        return account;
    }

    public String format (Account account){
        String builder = new StringBuilder().
        append(account.getAccountId()).append(";").
        append(account.getAccountName()).append(";").
        append(account.getAmountLocal()).append(";").
        toString();

        return builder;
    }
}
