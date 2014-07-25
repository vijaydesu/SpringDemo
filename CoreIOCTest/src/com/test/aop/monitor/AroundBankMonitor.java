/**
 * 
 */
package com.test.aop.monitor;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.test.aop.ReportBank;

/**
 * @author vdesu
 * 
 */
public class AroundBankMonitor implements MethodInterceptor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept
	 * .MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		
		System.out.println("****SPRING AOP**** DoAroundMethod: Method name : "
		+ methodInvocation.getMethod().getName());
		
		System.out.println("****SPRING AOP**** DoAroundMethod: Method arguments : "
						+ Arrays.toString(methodInvocation.getArguments()));

		// same with MethodBeforeAdvice

		System.out.println("****SPRING AOP**** DoAroundMethod: Before method executing!");

		try {
			/*
			 * Custom logic for negative amount check
			 */
			
			String amounts=Arrays.toString(methodInvocation.getArguments());
			
			Object result=null;
			
			
			//if("-".contains(amounts))
			//{
			// proceed to original method call
			result = methodInvocation.proceed();
			//}
			

			// same with AfterReturningAdvice
			System.out.println("****SPRING AOP**** DoAroundMethod: After method executing!");
			return result;

		} catch (IllegalArgumentException e) {

			// same with ThrowsAdvice
			System.out.println("****SPRING AOP**** DoAroundMethod: When method throws Exception!");
			throw e;

		}

		
	}

}
