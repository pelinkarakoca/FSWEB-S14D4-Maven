package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[]{new Chocolate("milk", 45.5, "may contains allergen"), new Coke("zero", 50.5, "do not drink more than 2 glasses a day"), new Bread("whole wheat", 10.99, "contains wheat, not suitable for gluten intolerance")};
	    listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
	    for (ProductForSale product : products) {
		    product.showDetails();
	    }
    }
}