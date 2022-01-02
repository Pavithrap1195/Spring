package com.xworkz.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Money {
	
	private double size;
	private String type;
	private String color;
	private String isCoinOrNote;
	
	public Money() {
		System.out.println(this.getClass().getSimpleName()+" Bean Created");
	}

	public Money( double size, String type, String color, String isCoinOrNote) {
		super();
		this.size = size;
		this.type = type;
		this.color = color;
		this.isCoinOrNote = isCoinOrNote;
	}

	@Override
	public String toString() {
		return "Money [size=" + size + ", type=" + type + ", color=" + color + ", isCoinOrNote=" + isCoinOrNote + "]";
	}

	public double getSize() {
		return size;
	}

	@Value("120.00")
	public void setSize(double size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	@Value("Note")
	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}
		
	@Value("Pink")
	public void setColor(String color) {
		this.color = color;
	}

	public String getIsCoinOrNote() {
		return isCoinOrNote;
	}
	
	@Value("Note")
	public void setIsCoinOrNote(String isCoinOrNote) {
		this.isCoinOrNote = isCoinOrNote;
	}
	
	

}
