package com.tka;

public class Student {

	
	private String name;
	private int age;
	private String city;
	public Student() {
		
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
	public Student(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
