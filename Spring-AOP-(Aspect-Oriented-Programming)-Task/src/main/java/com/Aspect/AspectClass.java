package com.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
	
    @Before("execution(void com.EntityClass.PlaceOrder.placeOrder())")
	public void logBefore() {
	    System.out.println("[Before] Checking stock before placing order...");
	}
  
    @After("execution(void com.EntityClass.PlaceOrder.placeOrder())")
    public void logAfter() {
        System.out.println(" [After] Sending order confirmation email...");
    }
	
	
  @Around("execution(void com.EntityClass.PlaceOrder.placeOrder())")
	public void logAround(ProceedingJoinPoint p) {
		try {
		    System.out.println("[Before] Checking stock before placing order...");

			p.proceed();
	        System.out.println(" [After] Sending order confirmation email...");

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	

}
