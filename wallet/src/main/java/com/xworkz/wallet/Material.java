package com.xworkz.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Material {
	
	private double size;
	private String type;
	private float thickness;
	private double price;
	
	public Material() {
		System.out.println(this.getClass().getSimpleName()+" Bean created");
		
	}

	public Material(double size, String type, float thickness, double price) {
		super();
		this.size = size;
		this.type = type;
		this.thickness = thickness;
		this.price = price;
	}

	public double getSize() {
		return size;
	}

	@Value("25.00")
	public void setSize(double size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	@Value("Leather")
	public void setType(String type) {
		this.type = type;
	}

	public float getThickness() {
		return thickness;
	}

	@Value("2.00f")
	public void setThickness(float thickness) {
		this.thickness = thickness;
	}

	public double getPrice() {
		return price;
	}

	@Value("500.00")
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Material [size=" + size + ", type=" + type + ", thickness=" + thickness + ", price=" + price + "]";
	}
	
	
	
	
	

}
