/**
 * 
 */
package com.test.aop.monitor;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author vdesu
 *
 */
public class AfterReturningBankMonitor implements AfterReturningAdvice {

	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable
	{
		
		System.out.println("****SPRING AOP**** DoAfterReturningMethod : Executing after method return!");

	}

}
