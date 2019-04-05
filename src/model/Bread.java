package model;

import java.util.Date;

public class Bread extends Product {
	private float weight;
	private Date expirationDate;
	private BreadType breadType;
	
	public Bread(float price, String title, int amount, float weight, Date expirationDate, BreadType breadType) {
		super(price, title, amount);
		this.weight = weight;
		this.expirationDate = expirationDate;
		this.breadType = breadType;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public BreadType getBreadType() {
		return breadType;
	}

	public void setBreadType(BreadType breadType) {
		this.breadType = breadType;
	}

	@Override
	public String toString() {
		return  breadType + "( " + weight + " kg, der.term: " + expirationDate + " ) " + getPrice() + " eur, " + getTitle() + " " + 
		+ getAmount() + " gab";
	}


	
}
