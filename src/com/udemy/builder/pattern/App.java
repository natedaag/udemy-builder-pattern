package com.udemy.builder.pattern;

public class App {

	public static void main(String[] args) {
		User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com")
								   .firstName("Bob")
								   .lastName("Max").build();;
		System.out.println(websiteUser);
	}

}
