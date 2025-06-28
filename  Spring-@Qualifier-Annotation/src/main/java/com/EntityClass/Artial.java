package com.EntityClass;

import org.springframework.stereotype.Component;

@Component("artial")
public class Artial implements Sim{

	@Override
	public String calling() {
		return "Artial is caaling";
	}   
}
