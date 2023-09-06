package task2.publictransportpark;

public class PublicTransport {
    private double price;
    private double fuelConsumption;
    private int passengerCapacity;

    public PublicTransport(double price, double fuelConsumption, int passengerCapacity) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.passengerCapacity = passengerCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "PublicTransport{" +
                "price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
