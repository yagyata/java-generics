package com.bridgelabz.mealPlanGenerator;
import java.util.List;
import java.util.ArrayList;

class MealPlanner {
    public static <T extends MealPlan> Meal<T> createMealPlan(T meal) {
        System.out.println("Processing meal plan: " + meal.getMealType());
        return new Meal<>(meal);
    }
}

class MealManager {
    private List<Meal<? extends MealPlan>> meals = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        meals.add(meal);
    }

    public void displayMeals() {
        for (Meal<? extends MealPlan> meal : meals) {
            meal.displayMeal();
        }
    }

    public boolean validateMeal(MealPlan meal) {
        return meal.getMealName() != null && !meal.getMealName().isEmpty();
    }
}
