package com.bridgelabz.dynamicOnlineMarketplace;

public class Marketplace {
    public static void main(String[] args) {
        ProductCatalogue marketplace = new ProductCatalogue();
        Product<BookCategory> book = new Product<>("Java Programming", 300.0, new BookCategory());
        Product<ClothingCategory> clothes = new Product<>("Shirt", 400.0, new ClothingCategory());
        Product<GadgetCategory> gadget = new Product<>("Laptop", 60000, new GadgetCategory());

        marketplace.addProduct(book);
        marketplace.addProduct(clothes);
        marketplace.addProduct(gadget);

        System.out.println("Before Discount:");
        marketplace.displayProducts();

        ProductCatalogue.applyDiscount(book, 10);
        ProductCatalogue.applyDiscount(clothes, 15);
        ProductCatalogue.applyDiscount(gadget, 5);

        System.out.println("\nAfter Discount:");
        marketplace.displayProducts();
    }
}
