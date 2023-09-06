package task2.publictransportpark;

public class Trolleybus extends PublicTransport {
    public Trolleybus(double price, double fuelConsumption, int passengerCapacity) {
        super(price, fuelConsumption, passengerCapacity);
    }

    @Override
    public String toString() {
        return "Trolleybus{" +
                "price=" + getPrice() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", passengerCapacity=" + getPassengerCapacity() +
                "}";
    }
}
