package com.bridgelabz.mealPlanGenerator;

interface MealPlan {
    String getMealType();
    String getMealName();
}

class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealType() {
        return "Vegetarian Meal";
    }

    public String getMealName() {
        return mealName;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealType() {
        return "Vegan Meal";
    }

    public String getMealName() {
        return mealName;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealType() {
        return "Keto Meal";
    }

    public String getMealName() {
        return mealName;
    }
}

class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealType() {
        return "High-Protein Meal";
    }

    public String getMealName() {
        return mealName;
    }
}