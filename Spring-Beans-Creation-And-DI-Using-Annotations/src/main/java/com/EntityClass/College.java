package com.EntityClass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("123")
	private int id;
	@Value("GCE")

	private String name;
	@Value("Dhule")

	private String city;
	
	public College() {
		
	}
	public College(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
