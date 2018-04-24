package com.udemy.car.builder;

public class App {
	
	public static void main(String... strings) {
		Vehicle vehicle = new Vehicle.Builder("Honda", "car")
									 .price(10000)
									 .horsePower(100)
									 .model("Civic")
									 .color("red")
									 .doors(5)
									 .build();
		System.out.println(vehicle);
	}

}
/*
 * private int price;
	private int horsePower;
	private String model;
	private String color;
	private int doors;
 */