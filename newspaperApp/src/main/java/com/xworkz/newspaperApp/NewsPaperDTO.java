package com.xworkz.newspaperApp;

public class NewsPaperDTO {

	private String newsPaperName;
	private double price;
	private String language;
	private int noOfPages;

	public NewsPaperDTO() {
		// TODO Auto-generated constructor stub
	}

	public NewsPaperDTO(String newsPaperName, double price, String language, int noOfPages) {
		super();
		this.newsPaperName = newsPaperName;
		this.price = price;
		this.language = language;
		this.noOfPages = noOfPages;
	}

	public String getNewsPaperName() {
		return newsPaperName;
	}

	public void setNewsPaperName(String newsPaperName) {
		this.newsPaperName = newsPaperName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "NewsPaper [newsPaperName=" + newsPaperName + ", price=" + price + ", language=" + language
				+ ", noOfPages=" + noOfPages + "]";
	}

}
