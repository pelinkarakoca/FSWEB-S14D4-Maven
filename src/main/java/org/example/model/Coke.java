package org.example.model;

public class Coke extends ProductForSale{
	private String flavor;

	public Coke(String type, double price, String description) {
		super(type, price, description);

	}

	@Override
	public void showDetails() {
		System.out.println(getType() + "coke $" + getPrice()+ ". Coke with " + flavor+ "flavor. " + getDescription());
	}
}
