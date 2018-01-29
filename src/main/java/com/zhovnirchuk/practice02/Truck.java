package com.zhovnirchuk.practice02;

import java.util.List;

public class Truck implements Car {
	
	private List<Tire> tires;
	private String title;
	private String cargo;
	
	public Truck(String title) {
		this.title = title;
	}
	
	public void setTires(List<Tire> tires) {
		this.tires = tires;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void drive() {
		System.out.println("Truck " + this.title + ", delivers " + this.cargo + ", tires: ");
		for(Tire t : this.tires) {
			System.out.println(t + " - is runninng");
		}
	}

}
