package com.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {
	
//    @Before("execution(void com.EntityClass.Rechage.rechage())")
//	public void beforerechage() {
//		System.out.println("you pack expiring soon...");
//	}
//
//    
//    @After("execution(void com.EntityClass.Rechage.rechage())")
//	public void afterrechage() {
//		System.out.println("you pack is sussuce");
//	}
	
	
  @Around("execution(void com.EntityClass.Rechage.rechage())")
	public void afterrechage(ProceedingJoinPoint p) {
		try {
			System.out.println("you pack expiring soon...");

			p.proceed();
			System.out.println("you pack is sussuce");

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	

}
