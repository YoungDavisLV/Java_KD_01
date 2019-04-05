package model;

public class Product {
	
	private float price;
	private String title;
	private int amount;
	
	public Product(float price, String title, int amount) {
		super();
		this.price = price;
		this.title = title;
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", title=" + title + ", amount=" + amount + "]";
	}

	
}
