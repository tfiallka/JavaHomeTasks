package task1.appliances;

public class VacuumCleaner extends Appliances {
    private double suctionPower;
    private double noiseLevel;
    private double currentCharge;

    public VacuumCleaner(String producer, double power, double suctionPower, double noiseLevel) {
        super(producer, power);
        this.suctionPower = suctionPower;
        this.noiseLevel = noiseLevel;
    }

    @Override
    public void showDescription() {
        System.out.println("Пылесос " + getProducer() + " имеет следующие характеристики: " +
                "\nМощость всасывания: " + suctionPower +
                "\nУровень шума: " + noiseLevel +
                "\nПотребляемая мощность, Вт: " + getPower());
    }

    @Override
    public void turnOn() {
        System.out.println("Пылесос " + getProducer() + " включён");
    }

    public double getSuctionPower() {
        return suctionPower;
    }

    public void setSuctionPower(double suctionPower) {
        this.suctionPower = suctionPower;
    }

    public double getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(double noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public double getCurrentCharge() {
        return currentCharge;
    }

    public void setCurrentCharge(double currentCharge) {
        this.currentCharge = currentCharge;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "producer='" + getProducer() + '\'' +
                ", power=" + getPower() +
                ", suctionPower=" + suctionPower +
                ", noiseLevel=" + noiseLevel +
                '}';
    }
}
