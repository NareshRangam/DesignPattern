package com.ss.composite;

public class CompositeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompositeAccount compositeAccount=new CompositeAccount();
		compositeAccount.addAccount(new DepositAccount("DAcc123", 200));
		compositeAccount.addAccount(new SavingsAccount("SAcc123", 200));
		compositeAccount.addAccount(new DepositAccount("DAcc234", 200));
		
		float totalBalance=compositeAccount.getBalance();
		System.out.println(totalBalance);
	}

}
