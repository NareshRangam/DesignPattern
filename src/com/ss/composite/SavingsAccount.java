package com.ss.composite;

public class SavingsAccount extends Account{

	private String accountNumber;
	private float accountbalance;
	
	public SavingsAccount(String accountNumber, float accountbalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountbalance = accountbalance;
	}

	@Override
	public float getBalance() {
		
		return accountbalance;
	}
}
