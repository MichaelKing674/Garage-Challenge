package com.qa.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage{
	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	
	@Override
	public String toString() {
		return "" + vehicles;
	}

	public void fixGarage() {
		for (Vehicle v : vehicles) {
			if (v.getType() == "Car") {
				fixCar(v);
			}
			else if (v.getType() == "Motorbike") {
				fixBike(v);
			}
			else if (v.getType() == "Quadbike") {
				fixQuad(v);
			}
			else {
				System.out.println("Error");
			}
		}
	}
	
	public void removeType(String type) {
		List<Vehicle> toRemove = new ArrayList<Vehicle>();
		for (Vehicle v : vehicles) {
			if (v.getType() == type) {
				toRemove.add(v);
			}
		}
		for (Vehicle v : toRemove) {
			vehicles.remove(v);
		}
	}
	
	public void add(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public void remove(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}
	
	public void fixCar(Vehicle vehicle) {
		double price = ((Car)vehicle).getPrice();
		double cost = (((Car)vehicle).topSpeed / 100) * (price / 20);
		System.out.println("You have paid £" + cost + " for your " + vehicle.getModel() + ", thankyou.");
	}
	public void fixBike(Vehicle vehicle) {
		double price = vehicle.getPrice();
		double cost = (((Motorbike)vehicle).wheels * price)/ 20;
		System.out.println("You have paid £" + cost + " for your " + vehicle.getModel() + ", thankyou.");
	}
	public void fixQuad(Vehicle vehicle) {
		double cost = vehicle.getPrice() / 20;
		boolean electric = ((Quadbike)vehicle).electric;
		if (electric == true) {
			System.out.println("No repair costs for your " + vehicle.getModel() + " as it is electric.");
		} else {
			System.out.println("You have paid £" + cost + " for your " + vehicle.getModel() + ", thankyou.");
		}
	}
	
	public void clearGarage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you sure you want to clear you garage?");
		String result = scan.nextLine();
		if (result.equals("yes")) {
			vehicles.clear();
			System.out.println("All vehicles cleared.");
		} else if (result.equals("no")) {
			System.out.println("Vehicles remain in your garage");
		} else {
			System.out.println("Please type \"yes\" or \"no\"");
		}
	}
}
