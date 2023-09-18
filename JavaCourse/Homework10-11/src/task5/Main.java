package task5;

import task5.food.Apple;
import task5.food.Cucumber;
import task5.food.Salmon;

public class Main {
    public static void main(String[] args) {
        Cucumber cucumber = new Cucumber();
        Salmon salmon = new Salmon();
        Dish sushi = new Dish(cucumber, salmon);
        System.out.println(sushi.isVegetarian());
        Apple apple = new Apple();
        Dish bakedApple = new Dish(apple);
        bakedApple.isVegetarian();
        System.out.println(bakedApple.isVegetarian());
        Dish unknown = new Dish();
        System.out.println(unknown.isVegetarian(apple, cucumber));


    }
}
