package com.test.aop.monitor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/*
 * Spring AOP :
 * This is the spring way of implementing advice
 */

public class BankMonitor implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Executing Before Advice Method for "+arg0.getName());
	}

}
