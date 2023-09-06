package task2.publictransportpark;

public class Bus extends PublicTransport {
    public Bus(double price, double fuelConsumption, int passengerCapacity) {
        super(price, fuelConsumption, passengerCapacity);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "price=" + getPrice() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", passengerCapacity=" + getPassengerCapacity() +
                "}";
    }
}
