package task1.appliances;

public class WashingMachine extends Appliances {
    private double maximumLoad;

    public WashingMachine(String producer, double power, double maximumLoad) {
        super(producer, power);
        this.maximumLoad = maximumLoad;
    }


    @Override
    public void showDescription() {
        System.out.println("Стиральная машина " + getProducer() + " имеет следующие характеристики: " +
                "\nМаксимальная загрузка, кг: " + maximumLoad +
                "\nПотребляемая мощность, Вт: " + getPower());
    }

    @Override
    public void turnOn() {
        System.out.println("Стиральная машина " + getProducer() + " включёна");
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "producer='" + getProducer() + '\'' +
                ", power=" + getPower() +
                ", maximumLoad=" + maximumLoad +
                '}';
    }
}
