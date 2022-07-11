package com.qa.garage;

public class Car extends Vehicle {
	String model;
	int topSpeed;
	int price;
	String vehicle;
	String type;
	
	public Car() {}
	
	public Car(String type,String model,int topSpeed,int price) {
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Car:\nModel: " + model + "\nTopSpeed: " + topSpeed + "\nPrice: " + price + "\nType: " + type + "\n";
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

	public int getCarPrice() {
		return price;
	}

	public void setCarPrice(int price) {
		this.price = price;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
