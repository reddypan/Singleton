package com.vishal.singletonpattern;

public class Brand {

	private static Brand brand;
	
	private Brand() {
		
	}
	
	public static Brand getBrand() {
		if (brand == null ) {
			return new Brand();
		}
		return brand;
	}
	
	public String getBrandName() {
		return "Vishal";
	}
}
