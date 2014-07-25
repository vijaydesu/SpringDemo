/**
 * 
 */
package com.test.aop;

/**
 * @author vdesu
 *
 */
public class ReportBank {
	
	private Integer balance = 10000;
	
	public void deposit(int amount) throws IllegalArgumentException
	{
		if(amount <= 0)
		{
			throw new IllegalArgumentException("Invalid AMOUNT : "+amount);
		}
		balance+=amount;
	System.out.println("\t REPORT BANK ****** Depositing ***** "+amount)	;
	}
	
	public Integer getBalance()
	{
		System.out.println("\t REPORT BANK ****** GET Banalnce ***** "+balance)	;
		return balance;
	}
	
	public boolean checkBalance(int amount)
	{
		System.out.println("\t REPORT BANK ****** Check Banalnce ***** "+balance)	;
		return amount<=balance ;
	}
	
	public boolean withdraw(int amount)
	{
		if(balance >= amount)
		{
			balance -= amount;
			System.out.println("\t REPORT BANK ****** Withdrawing ***** "+amount)	;
			return true;
		}
		
		return false;
	}
	
	public void reportNegativeAmount()
	{
		System.out.println("REPORT BANK Negative Amount !!!!");
	}

}
