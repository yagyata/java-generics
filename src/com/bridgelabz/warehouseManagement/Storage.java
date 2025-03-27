package com.bridgelabz.warehouseManagement;
import java.util.List;
import java.util.ArrayList;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }
    public void removeItem(T item) {
        items.remove(item);
    }
    public List<T> getItems() {
        return items;
    }
}
