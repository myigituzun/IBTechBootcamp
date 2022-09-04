package com.myigituzun.hw03;

public class TransactionConverter {
	
	public Transaction parse(String line){
		Transaction transaction = new Transaction();
        String[] newLine = line.split(";");

        transaction.setTransactiınId(Long.parseLong(newLine[0]));
        transaction.setTransactionName(newLine[1]);
        transaction.setAmountLocal(Double.parseDouble(newLine[2]));

        return transaction;
    }

    public String format (Transaction transaction){
        String builder = new StringBuilder().
        append(transaction.getTransactiınId()).append(";").
        append(transaction.getTransactionName()).append(";").
        append(transaction.getAmountLocal()).append(";").
        toString();

        return builder;
    }
}
