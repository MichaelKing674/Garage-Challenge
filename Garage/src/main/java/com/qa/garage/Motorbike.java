package com.qa.garage;

public class Motorbike extends Vehicle {
	String model;
	int topSpeed;
	int price;
	String type;
	int engine;
	int wheels = 2;
	
	public Motorbike() {}
	
	public Motorbike(String type,String model,int topSpeed,int price, int engine, int wheels) {
		this.type = type;
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;
		this.engine = engine;
		this.wheels = wheels;
	}
	

	@Override
	public String toString() {
		return "Motorbike:\nModel: " + model + "\nTopSpeed: " + topSpeed + "\nPrice: " + price +
				"\nEngine: " + engine + "\n";
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

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
}
