package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configartion.Configclass;
import com.EntityClass.PlaceOrder;

public class Home {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configclass.class);
		PlaceOrder P = context.getBean(PlaceOrder.class);
		P.placeOrder();
	}
}
