package task5.food;

import static task5.food.FoodType.VEGETABLE;

public class Cucumber extends Food {
    private final FoodType foodType = VEGETABLE;
    private String name;

    @Override
    public FoodType getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "Cucumber{" +
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
