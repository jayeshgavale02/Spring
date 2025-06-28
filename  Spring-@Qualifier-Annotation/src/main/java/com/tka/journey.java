package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configartion.Configclass;
import com.EntityClass.Traveller;

public class journey {
	
	
	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(Configclass.class);
		 Traveller T = context.getBean(Traveller.class);
		 System.out.println(T.getTravellerperson1().journey());
		 System.out.println(T.getTravellerperson2().journey());
	}

}
