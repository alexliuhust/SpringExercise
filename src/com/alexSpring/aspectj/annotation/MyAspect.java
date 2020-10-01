package com.alexSpring.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* com.alexSpring.jdk.*.*(..))")
    private void myPointCut(){}
    
    @Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint) {
    	System.out.println("Before Advice: Checking Permission-------");
		System.out.print("Target Class: " + joinPoint.getTarget());
		System.out.println("The woven method: " + joinPoint.getSignature().getName());
    }
    
    @AfterReturning(value="myPointCut()")
    public void myAfterReturning(JoinPoint joinPoint) {
    	System.out.println("After-return Advice: Log Processing-------");
		System.out.println("The woven method: " + joinPoint.getSignature().getName());
    }
    
    @Around("myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable {
       
    	System.out.println("Begin Around: Open transaction------");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("End Around: Close transaction------");
		return obj;
    }
   
    @AfterThrowing(value="myPointCut()",throwing="e")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
    	System.out.println("Exception: " + e.getMessage());
    }
    
    @After("myPointCut()")
    public void myAfter() {
    	System.out.println("Final Advice: Release Resuorces------");
    }
}
