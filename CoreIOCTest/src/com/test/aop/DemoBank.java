/**
 * 
 */
package com.test.aop;

/**
 * @author vdesu
 *
 */
public class DemoBank {
	
	private Integer balance = 10000;
	
	public void deposit(int amount) throws IllegalArgumentException
	{
		if(amount <= 0)
		{
			throw new IllegalArgumentException("Invalid AMOUNT : "+amount);
		}
		balance+=amount;
	System.out.println("\t DEMO BANK ****** Depositing ***** "+amount)	;
	}
	
	public Integer getBalance()
	{
		System.out.println("\t DEMO BANK ****** GET Banalnce ***** "+balance)	;
		return balance;
	}
	
	public boolean checkBalance(int amount)
	{
		System.out.println("\t DEMO BANK ****** Check Banalnce ***** "+balance)	;
		return amount<=balance ;
	}
	
	public boolean withdraw(int amount)
	{
		if(balance >= amount)
		{
			balance -= amount;
			System.out.println("\t DEMO BANK ****** Withdrawing ***** "+amount)	;
			return true;
		}
		
		return false;
	}
	
	public void reportNegativeAmount()
	{
		System.out.println("DemoBank Negative Amount !!!!");
	}

}
