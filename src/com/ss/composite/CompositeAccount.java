package com.ss.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Account {

	private float totalBalance;
	private List<Account> accountList=new ArrayList<Account>();
	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		totalBalance=0;
		for(Account account:accountList)
		{
			totalBalance=totalBalance+account.getBalance();
		}
		return totalBalance;
	}
	public void addAccount(Account account)
	{
		accountList.add(account);
	}
	public void removeAccount(Account account)
	{
		accountList.remove(account);
	}

}
