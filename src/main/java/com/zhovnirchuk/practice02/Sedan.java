package com.zhovnirchuk.practice02;

import java.util.List;

public class Sedan implements Car {

	private List<Tire> tires;
	private String title;
	
	public Sedan(String title) {
		this.title = title;
	}
	
	public void setTires(List<Tire> tires) {
		this.tires = tires;
	}

	public void drive() {
		System.out.println("Sedan " + this.title + ", tires: ");
		for(Tire t : this.tires) {
			System.out.println(t + " - is runninng");
		}
	}

}
