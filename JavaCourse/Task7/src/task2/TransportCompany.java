package task2;

import task2.publictransportpark.Bus;
import task2.publictransportpark.PublicTransport;
import task2.publictransportpark.Tram;
import task2.publictransportpark.Trolleybus;

public class TransportCompany {
        private static final int PARK_SIZE = 10;

        private String name;

        private Bus[] busPark = new Bus[PARK_SIZE];
        private Tram[] tramPark = new Tram[PARK_SIZE];
        private Trolleybus[] trolleybusPark = new Trolleybus[PARK_SIZE];

        private int busParkCurrentSize = 0;
        private int tramParkCurrentSize = 0;
        private int trolleybusParkCurrentSize = 0;

        public TransportCompany(String name) {
            this.name = name;
        }

        public boolean addBus(Bus bus) {
            if (busParkCurrentSize <= busPark.length) {
                busPark[busParkCurrentSize] = bus;
                busParkCurrentSize++;
                return true;
            } else {
                return false;
            }
        }

        public boolean addTram(Tram tram) {
            if (tramParkCurrentSize <= tramPark.length) {
                tramPark[tramParkCurrentSize] = tram;
                tramParkCurrentSize++;
                return true;
            } else {
                return false;
            }
        }

        public boolean addTrolleybus(Trolleybus trolleybus) {
            if (trolleybusParkCurrentSize <= trolleybusPark.length) {
                trolleybusPark[trolleybusParkCurrentSize] = trolleybus;
                trolleybusParkCurrentSize++;
                return true;
            } else {
                return false;
            }
        }

        public double calculateTotalPrice() {
            double totalPrice = 0;
            for (int i = 0; i < PARK_SIZE; i++) {
                Bus bus = busPark[i];
                if (bus != null) {
                    totalPrice += bus.getPrice();
                }

                Tram tram = tramPark[i];
                if (tram != null) {
                    totalPrice += tram.getPrice();
                }

                Trolleybus trolleybus = trolleybusPark[i];
                if (trolleybus != null) {
                    totalPrice += trolleybus.getPrice();
                }
            }
            return totalPrice;
        }

        public void sortBusParkByFuelConsumption() {
            for (int i = 0; i < busParkCurrentSize - 1; i++) {
                for (int j = 0; j < busParkCurrentSize - i - 1; j++) {
                    if (busPark[j].getFuelConsumption() > busPark[j + 1].getFuelConsumption()) {
                        Bus temp = busPark[j];
                        busPark[j] = busPark[j + 1];
                        busPark[j + 1] = temp;
                    }
                }
            }
        }

    public void sortParkByFuelConsumption() {
            int publicTransportParkCurrentSize = busParkCurrentSize + tramParkCurrentSize + trolleybusParkCurrentSize;
            PublicTransport[] publicTransportPark = new PublicTransport[publicTransportParkCurrentSize];
        for (int i = 0; i < busParkCurrentSize; i++) {
                    publicTransportPark[i] = busPark[i];
            }
        for (int i = busParkCurrentSize; i < busParkCurrentSize + tramParkCurrentSize; i++) {
            publicTransportPark[i] = tramPark[i];
        }
        for (int i = busParkCurrentSize + tramParkCurrentSize; i < publicTransportParkCurrentSize; i++) {
            publicTransportPark[i] = tramPark[i];
        }
        for (int i = 0; i < publicTransportParkCurrentSize - 1; i++) {
            for (int j = 0; j < publicTransportParkCurrentSize - i - 1; j++) {
                if (publicTransportPark[j].getFuelConsumption() > publicTransportPark[j + 1].getFuelConsumption()) {
                    PublicTransport temp = publicTransportPark[j];
                    publicTransportPark[j] = publicTransportPark[j + 1];
                    publicTransportPark[j + 1] = temp;
                }
            }
        }
    }
        public Bus[] findBusesByPassengerCapacity(int min, int max) {
            int foundBasesCount = 0;
            for (int i = 0; i < busParkCurrentSize; i++) {
                if (busPark[i].getPassengerCapacity() >= min && busPark[i].getPassengerCapacity() <= max) {
                    foundBasesCount++;
                }
            }
            Bus[] foundBuses = new Bus[foundBasesCount];
            int foundBusesCounter = 0;
            for (int i = 0; i < busParkCurrentSize; i++) {
                if (busPark[i].getPassengerCapacity() >= min && busPark[i].getPassengerCapacity() <= max) {
                    foundBuses[foundBusesCounter] = busPark[i];
                    foundBusesCounter++;
                }
            }
            return foundBuses;
        }

        public String getName() {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

    public Bus[] getBusPark() {
        return busPark;
    }

    public void setBusPark(Bus[] busPark) {
        this.busPark = busPark;
    }

    public Tram[] getTramPark() {
        return tramPark;
    }

    public void setTramPark(Tram[] tramPark) {
        this.tramPark = tramPark;
    }

    public Trolleybus[] getTrolleybusPark() {
        return trolleybusPark;
    }

    public void setTrolleybusPark(Trolleybus[] trolleybusPark) {
        this.trolleybusPark = trolleybusPark;
    }
}

