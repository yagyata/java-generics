package com.bridgelabz.dynamicOnlineMarketplace;

abstract class Category {
    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName(){
        return categoryName;
    }
}

class BookCategory extends Category{
    public BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends Category{
    public ClothingCategory(){
        super("Clothes");
    }
}

class GadgetCategory extends Category{
    public GadgetCategory() {
        super("Laptop");
    }
}
