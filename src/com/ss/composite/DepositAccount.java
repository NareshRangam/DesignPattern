package com.ss.composite;

public class DepositAccount extends Account {

	private String accountNumber;
	private float accountbalance;
	
	public DepositAccount(String accountNumber, float accountbalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountbalance = accountbalance;
	}

	@Override
	public float getBalance() {
		
		return accountbalance;
	}

}
