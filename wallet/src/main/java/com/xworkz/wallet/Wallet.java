package com.xworkz.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//application context treat Wallet class as bean/object/component  and this annotation looks for default constructor then bean is created
@Component
public class Wallet {

	//To initialize we use @value annotation
	@Value("Black")//we can use this annotation above the setter method also for every properties
	private String color;
	
	@Value("Samsung")
	private String brand;
	
	@Autowired //to initialize the bean type property
	private Material material;
	
	@Value("2500.00")
	private double price;
	
	@Autowired
	private Money money;
	
	@Autowired
	private ATMCard atmCard;
	
	@Autowired
	private Photo photo;

	public Wallet() {
		System.out.println(this.getClass().getSimpleName() + " Bean Created");
	}

	public Wallet(String color, String brand, Material material, double price, Money money, ATMCard atmCard,
			Photo photo) {
		System.out.println(this.getClass().getSimpleName() + " Parameterized Bean Created");
		this.color = color;
		this.brand = brand;
		this.material = material;
		this.price = price;
		this.money = money;
		this.atmCard = atmCard;
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Wallet [color=" + color + ", brand=" + brand + ", material=" + material + ", price=" + price
				+ ", money=" + money + ", atmCard=" + atmCard + ", photo=" + photo + "]";
	}
	
	
	
	
	
	
	
	

}
