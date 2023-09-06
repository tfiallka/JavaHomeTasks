package task2.publictransportpark;

public class Tram extends PublicTransport {
    public Tram(double price, double fuelConsumption, int passengerCapacity) {
        super(price, fuelConsumption, passengerCapacity);
    }

    @Override
    public String toString() {
        return "Tram{" +
                "price=" + getPrice() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", passengerCapacity=" + getPassengerCapacity() +
                "}";
    }
}
