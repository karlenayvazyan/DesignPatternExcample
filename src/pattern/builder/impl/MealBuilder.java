package pattern.builder.impl;

import pattern.builder.impl.burger.ChickenBurger;
import pattern.builder.impl.burger.VegBurger;
import pattern.builder.impl.dring.Coke;
import pattern.builder.impl.dring.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
