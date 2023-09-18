package task5;

import task5.food.Food;

import static task5.food.FoodType.FRUIT;
import static task5.food.FoodType.VEGETABLE;

public class Dish {

    Food[] foods;

    public Dish(Food... foods) {
        this.foods = foods;
    }

    public Dish() {
    }

    public boolean isVegetarian(Food... foods) {
        boolean isVegetarian = false;
        for (Food food : foods) {
            if (food.getFoodType() != VEGETABLE & food.getFoodType() != FRUIT) {
                isVegetarian = false;
                break;
            }
            isVegetarian = true;
        }
        return isVegetarian;
    }

    public boolean isVegetarian() {
        boolean isVegetarian = false;
        for (Food food : foods) {
            if (food.getFoodType() != VEGETABLE & food.getFoodType() != FRUIT) {
                isVegetarian = false;
                break;
            }
            isVegetarian = true;
        }
        return isVegetarian;
    }


}
