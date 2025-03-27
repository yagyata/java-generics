package com.bridgelabz.dynamicOnlineMarketplace;

import java.util.*;

class ProductCatalogue {
    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product<? extends Category> product : products) {
            System.out.println(product);
        }
    }

    // Generic Method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
        System.out.println("Discount applied: " + percentage + "% on " + product.getName());
    }
}
