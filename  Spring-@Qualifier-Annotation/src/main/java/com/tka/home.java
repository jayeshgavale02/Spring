package com.tka;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configartion.Configclass;
import com.EntityClass.User;

public class home {

	public static void main(String[] args) {

	ApplicationContext context = new AnnotationConfigApplicationContext(Configclass.class);
	
	User s = context.getBean(User.class);
	System.out.println(s.getSim1().calling());
	System.out.println(s.getSim2().calling());

	

		
	}

}
