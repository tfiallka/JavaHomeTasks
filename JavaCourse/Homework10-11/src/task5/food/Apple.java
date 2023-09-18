package task5.food;

import static task5.food.FoodType.FRUIT;

public class Apple extends Food {
    private final FoodType foodType = FRUIT;
    private String name;

    @Override
    public FoodType getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "foodType=" + foodType +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
