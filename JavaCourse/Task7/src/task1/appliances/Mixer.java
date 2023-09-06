package task1.appliances;

public class Mixer extends KitchenAppliances {
    private int numberOfSpeeds;

    public Mixer(String producer, double power, int numberOfSpeeds) {
        super(producer, power);
        this.numberOfSpeeds = numberOfSpeeds;
    }

    @Override
    public void showDescription() {
        System.out.println("Миксер " + getProducer() + " имеет следующие характеристики: " +
                "\nКоличество скоростей: " + numberOfSpeeds +
                "\nПотребляемая мощность, Вт: " + getPower());

    }

    @Override
    public void turnOn() {
        System.out.println("Миксер " + getProducer() + " включён");
    }

    @Override
    public String toString() {
        return "Mixer{" +
                "producer='" + getProducer() + '\'' +
                ", power=" + getPower() +
                ", numberOfSpeeds=" + numberOfSpeeds +
                "} ";
    }
}
