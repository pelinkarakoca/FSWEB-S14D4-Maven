package org.example.model;

public class Chocolate extends ProductForSale{
	private double milkAmount;
	public Chocolate(String type, double price, String description) {
		super(type, price, description);
	}

	@Override
	public void showDetails() {
		System.out.println(getType() + "chocolate $" + getPrice()+ ". This chocolate contains %" + milkAmount+ "milk. " + getDescription());
	}

}
