package com.bridgelabz.mealPlanGenerator;

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = MealPlanner.createMealPlan(new VegetarianMeal("Grilled Veggie Salad"));
        Meal<VeganMeal> veganMeal = MealPlanner.createMealPlan(new VeganMeal("Tofu"));
        Meal<KetoMeal> ketoMeal = MealPlanner.createMealPlan(new KetoMeal("Grilled Chicken"));
        Meal<HighProteinMeal> proteinMeal = MealPlanner.createMealPlan(new HighProteinMeal("Eggs"));

        MealManager manager = new MealManager();
        manager.addMeal(vegMeal);
        manager.addMeal(veganMeal);
        manager.addMeal(ketoMeal);
        manager.addMeal(proteinMeal);

        System.out.println("Available Meal Plans:");
        manager.displayMeals();

        // Validate a meal
        System.out.println("\nValidating Meals:");
        System.out.println("Vegetarian Meal Valid: " + manager.validateMeal(vegMeal.getMeal()));
        System.out.println("Vegan Meal Valid: " + manager.validateMeal(veganMeal.getMeal()));
        System.out.println("Keto Meal Valid: " + manager.validateMeal(ketoMeal.getMeal()));
        System.out.println("High-Protein Meal Valid: " + manager.validateMeal(proteinMeal.getMeal()));
    }
}
