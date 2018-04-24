package com.udemy.car.builder;

public class Vehicle {
	
	private String make;
	private String type;
	
	private int price;
	private int horsePower;
	private String model;
	private String color;
	private int doors;
	
	private Vehicle(Builder builder) {
		
		this.make = builder.make;
		this.type = builder.type;
		
		this.price = builder.price;
		this.horsePower = builder.horsePower;
		this.model = builder.model;
		this.color = builder.color;
		this.doors = builder.doors;
	}
	
	public String toString() {
		return "Vehicle [make=" + make + ", type=" + type
				+ ", price=" + price + ", horsePower=" + horsePower 
				+ ", model=" + model + ", color=" + color + ", doors=" + doors + "]";
		}
	
	public static class Builder {
	 		
		private String make;
		private String type;
			
		private int price;
		private int horsePower;
		private String model;
		private String color;
		private int doors;
		
		public Builder(String make, String type) {
			this.make = make;
			this.type = type;
		}
		public Builder price(int value) {
			this.price = value; 
			return this;
		}
		public Builder horsePower(int value) {
			this.horsePower = value; 
			return this;
		}
		public Builder model(String value) {
			this.model = value; 
			return this;
		}
		public Builder color(String value) {
			this.color = value; 
			return this;
		}
		public Builder doors(int value) {
			this.doors = value; 
			return this;
		}
		
		public Vehicle build() {
			return new Vehicle(this);
		}
		
	}

}
