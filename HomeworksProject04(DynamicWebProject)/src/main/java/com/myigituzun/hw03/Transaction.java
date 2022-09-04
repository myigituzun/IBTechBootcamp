package com.myigituzun.hw03;

public class Transaction {
	private long transactiınId;
	private String transactionName;
	private double amountLocal;

	public Transaction(long transactiınId, String transactionName, double amountLocal) {
		super();
		this.transactiınId = transactiınId;
		this.transactionName = transactionName;
		this.amountLocal = amountLocal;
	}

	public Transaction() {
		super();
	}

	public long getTransactiınId() {
		return transactiınId;
	}

	public void setTransactiınId(long transactiınId) {
		this.transactiınId = transactiınId;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public double getAmountLocal() {
		return amountLocal;
	}

	public void setAmountLocal(double amountLocal) {
		this.amountLocal = amountLocal;
	}

	@Override
	public String toString() {
		return "Transaction [transactiınId=" + transactiınId + ", transactionName=" + transactionName + ", amountLocal="
				+ amountLocal + "]";
	}
	

}
