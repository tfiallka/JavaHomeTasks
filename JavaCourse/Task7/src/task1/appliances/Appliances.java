package task1.appliances;

public abstract class Appliances {
    private String producer;
    private double power;

    public Appliances(String producer, double power) {
        this.producer = producer;
        this.power = power;
    }

    public abstract void showDescription();

    public abstract void turnOn();

    public double getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "producer='" + producer + '\'' +
                ", power=" + power +
                '}';
    }
}
