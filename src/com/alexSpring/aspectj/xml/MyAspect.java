package com.alexSpring.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
	/**
	 * Before Advice
	 * @param joinPotin
	 */
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("Before Advice: Checking Permission-------");
		System.out.print("Target Class: " + joinPoint.getTarget());
		System.out.println("The woven method: " + joinPoint.getSignature().getName());
	}
	
	/**
	 * After-returning Advice
	 * @param joinPotin
	 */
	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("After-return Advice: Log Processing-------");
		System.out.println("The woven method: " + joinPoint.getSignature().getName());
	}
	
	/**
	 * Around Advice
	 * @param proceedingJoinPoint
	 * @throws Throwable 
	 */
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("Begin Around: Open transaction------");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("End Around: Close transaction------");
		return obj;
	}
	
	/**
	 * After-throwing Advice
	 * @param joinPotin
	 * @param e
	 */
	public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("Exception: " + e.getMessage());
	}
	
	/**
	 * After Advice
	 */
	public void myAfter() {
		System.out.println("Final Advice: Release Resuorces------");
	}
}
