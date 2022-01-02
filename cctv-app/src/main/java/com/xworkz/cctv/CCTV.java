package com.xworkz.cctv;

public class CCTV {

	private String brand;
	private int cameraSize;
	private double price;
	private String color;

	public CCTV() {
		System.out.println(this.getClass().getSimpleName() + " Object is Created");

	}

	public CCTV(String brand, int cameraSize, double price, String color) {
		System.out.println(this.getClass().getSimpleName() + " Object is Created");
		this.brand = brand;
		this.cameraSize = cameraSize;
		this.price = price;
		this.color = color;
	}

	public void record() {
		System.out.println("Invoked record()");
	}

	public void autoDelete() {
		System.out.println("Invoked autoDelete()");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCameraSize() {
		return cameraSize;
	}

	public void setCameraSize(int cameraSize) {
		this.cameraSize = cameraSize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
