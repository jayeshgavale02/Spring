package com.EntityClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Jayesh")
	private String name;
	@Value("21")
	private int age;
	@Value("Dhulez")
	private String city;
	
	@Autowired
	private College C;
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + ", C=" + C + "]";
	}
	public Student(String name, int age, String city, College c) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		C = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public College getC() {
		return C;
	}
	public void setC(College c) {
		C = c;
	}

   
}
