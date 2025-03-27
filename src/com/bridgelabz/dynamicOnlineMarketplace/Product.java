package com.bridgelabz.dynamicOnlineMarketplace;

class Product<T extends Category>  {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }
}
