package com.EntityClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
     
	@Autowired
	@Qualifier("Person1")
	private Dhule Travellerperson1;
	
	@Autowired
	@Qualifier("Person2")
	private Dhule Travellerperson2;

	public Traveller() {

	}

	@Override
	public String toString() {
		return "Traveller [Travellerperson1=" + Travellerperson1 + ", Travellerperson2=" + Travellerperson2 + "]";
	}

	public Dhule getTravellerperson1() {
		return Travellerperson1;
	}

	public void setTravellerperson1(Dhule travellerperson1) {
		Travellerperson1 = travellerperson1;
	}

	public Dhule getTravellerperson2() {
		return Travellerperson2;
	}

	public void setTravellerperson2(Dhule travellerperson2) {
		Travellerperson2 = travellerperson2;
	}

	public Traveller(Dhule travellerperson1, Dhule travellerperson2) {
		super();
		Travellerperson1 = travellerperson1;
		Travellerperson2 = travellerperson2;
	}

}
