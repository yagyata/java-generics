package com.bridgelabz.mealPlanGenerator;

public class MealPlanner {
    public static <T extends MealPlan> Meal<T> createMealPlan(T meal) {
        System.out.println("Processing meal plan: " + meal.getMealType());
        return new Meal<>(meal);
    }
}
