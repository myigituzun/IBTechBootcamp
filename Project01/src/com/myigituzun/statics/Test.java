package com.myigituzun.statics;

public class Test {
    public static void main(String[] args) {
        BankAccount.setRate(24);

        BankAccount account1 = new BankAccount();
        account1.setInvestment(3000);
        BankAccount.setRate(36);
        System.out.println("Tutar I 9 Aylık: " + account1.getAmount(9));
        System.out.println("Tutar I Yıllık: " + account1.getAmount());

        BankAccount account2 = new BankAccount();
        account2.setInvestment(4000);
        System.out.println("Tutar II 9 Aylık: " + account2.getAmount(9));
        System.out.println("Tutar II Yıllık: " + account2.getAmount());

    }
}
