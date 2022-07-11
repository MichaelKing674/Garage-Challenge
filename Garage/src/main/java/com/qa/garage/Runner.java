package com.qa.garage;

public class Runner {
	public static void main(String[] args) {
		Vehicle car1 = new Car("Car","Tesla Model 3",160,48490);
		Vehicle car2 = new Car("Car","Audi RS6",155,97670);
		Vehicle bike1 = new Motorbike("Motorbike","Honda CBR500R",112,6499,500, 2);
		Vehicle bike2 = new Motorbike("Motorbike","BMW M 1000 RR",190,31000,1000, 2);
		Vehicle quad1 = new Quadbike("Quadbike","Tesla Cyberquad",10,1590,true);
		Vehicle quad2 = new Quadbike("Quadbike","CFMOTO ZForce 1000",120,13999,false);
		Garage garage1 = new Garage();
		garage1.add(car1);
//		garage1.add(car2);
//		garage1.add(bike1);
//		garage1.add(bike2);
//		garage1.add(quad1);
//		garage1.add(quad2);
//		garage1.fixGarage();
//		garage1.clearGarage();
//		System.out.println(garage1.toString());
//		garage1.removeType("Motorbike");
		System.out.println(garage1.toString());
	}
}
 