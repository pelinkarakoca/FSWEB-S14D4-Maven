package org.example.model;

public class Bread extends ProductForSale {
	private String flour;

	public Bread(String type, double price, String description) {
		super(type, price, description);
	}

	@Override
	public void showDetails() {
		System.out.println(getType() + "bread $" + getPrice()+ ". " + flour+ "bread. " + getDescription());
	}
}
