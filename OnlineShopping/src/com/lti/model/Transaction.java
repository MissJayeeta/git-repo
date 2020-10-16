package com.lti.model;

import java.time.LocalDate;

public class Transaction {
	int TransactionId;
	LocalDate transcationDate;
	double amount;

	public int getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}

	public LocalDate getTranscationDate() {
		return transcationDate;
	}

	public void setTranscationDate(LocalDate transcationDate) {
		this.transcationDate = transcationDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
