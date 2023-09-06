package task1.appliances;

public class Kettle extends KitchenAppliances {
    private double volume;
    private Boolean hasWaterLevelIndication;

    public Kettle(String producer, double power, double volume, Boolean hasWaterLevelIndication) {
        super(producer, power);
        this.volume = volume;
        this.hasWaterLevelIndication = hasWaterLevelIndication;
    }

    @Override
    public void showDescription() {
        System.out.println("Чайник " + getProducer() + " имеет следующие характеристики: " +
                "\nОбъём, л: " + volume +
                "\nИндикатор уровня воды: " + (hasWaterLevelIndication ? "есть " : "нет") +
                "\nПотребляемая мощность, Вт: " + getPower());
    }

    @Override
    public void turnOn() {
        System.out.println("Чайник " + getProducer() + " включён");

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Boolean getHasWaterLevelIndication() {
        return hasWaterLevelIndication;
    }

    public void setHasWaterLevelIndication(Boolean hasWaterLevelIndication) {
        this.hasWaterLevelIndication = hasWaterLevelIndication;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "producer='" + getProducer() + '\'' +
                ", power=" + getPower() +
                ", volume=" + volume +
                ", hasWaterLevelIndication=" + hasWaterLevelIndication +
                "}";
    }
}
