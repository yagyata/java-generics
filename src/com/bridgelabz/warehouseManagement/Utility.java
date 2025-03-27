package com.bridgelabz.warehouseManagement;
import java.util.*;

public class Utility {
    public static void displayItems(List<? extends WarehouseItem> item){
        if(item.isEmpty()) {
            System.out.println("No items found");
        }
        for(WarehouseItem items : item) {
            System.out.println(item);
        }
    }
}
