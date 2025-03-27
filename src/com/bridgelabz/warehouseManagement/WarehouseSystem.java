package com.bridgelabz.warehouseManagement;

public class WarehouseSystem {
    public static void main(String[] args){
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 80000));
        electronicsStorage.addItem(new Electronics("Smartphone", 50000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 200));
        groceriesStorage.addItem(new Groceries("Milk", 50));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa", 25000));
        furnitureStorage.addItem(new Furniture("Table", 10000));

        System.out.println("Electronics in Storage:");
        Utility.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries in Storage:");
        Utility.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture in Storage:");
        Utility.displayItems(furnitureStorage.getItems());
    }
}
