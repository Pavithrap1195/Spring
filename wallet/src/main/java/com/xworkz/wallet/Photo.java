package com.xworkz.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Photo {
	
	@Value("${size}")
	private String size;
	
	@Value("${price}")
	private double price;

	public Photo() {
		System.out.println(this.getClass().getSimpleName() + " Bean created");
	}

	public Photo(String size, double price) {
		super();
		this.size = size;
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Photo [size=" + size + ", price=" + price + "]";
	}

	
	
}
