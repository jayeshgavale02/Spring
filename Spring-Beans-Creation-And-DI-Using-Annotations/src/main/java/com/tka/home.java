package com.tka;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configartion.Configclass;
import com.EntityClass.Student;

public class home {

	public static void main(String[] args) {

	ApplicationContext context = new AnnotationConfigApplicationContext(Configclass.class);
	
	Student s = context.getBean(Student.class);
	System.out.println(s);
	
	

		
	}

}
