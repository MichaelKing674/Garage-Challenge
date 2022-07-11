package com.qa.garage;

public class Quadbike extends Vehicle {
	String model;
	int topSpeed;
	int price;
	String type;
	boolean electric;
	
	public Quadbike() {}
	
	public Quadbike(String type,String model,int topSpeed,int price,boolean electric) {
		this.type = type;
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;
		this.electric = electric;
	}
	@Override
	public String toString() {
		return "QuadBike:\nModel: " + model + "\nTopSpeed: " + topSpeed + "\nPrice: " + price + "\nType: " + type
				+ "\nElectric: " + electric + "\n";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isElectric() {
		return electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}
	
}
