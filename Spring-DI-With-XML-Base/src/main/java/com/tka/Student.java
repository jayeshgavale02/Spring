package com.tka;

public class Student {

	
	private String name;
	private int age;
	private String city;
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
