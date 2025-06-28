package com.EntityClass;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim{

	@Override
	public String calling() {
		return "Jio is caaling";
	}

		
}
