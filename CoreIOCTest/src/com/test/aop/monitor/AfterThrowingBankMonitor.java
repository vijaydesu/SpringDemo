/**
 * 
 */
package com.test.aop.monitor;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author vdesu
 *
 */
public class AfterThrowingBankMonitor implements ThrowsAdvice 
{
	public void afterThrowing(IllegalArgumentException e) throws Throwable 
	{

		System.out.println("****SPRING AOP**** DoAfterThrowingExceptionMethod : Executing when method throws exception!");

	}

}
