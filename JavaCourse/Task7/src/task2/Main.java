package task2;

import task2.publictransportpark.Bus;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(20000, 34, 15);
        Bus bus2 = new Bus(20000, 34, 40);
        Bus bus3 = new Bus(20000, 34, 20);
        Bus bus4 = new Bus(20000, 34, 40);
        Bus bus5 = new Bus(20000, 34, 48);
        Bus bus6 = new Bus(20000, 34, 45);

        TransportCompany company1 = new TransportCompany("Park #123");
        company1.addBus(bus1);
        company1.addBus(bus2);
        company1.addBus(bus3);
        company1.addBus(bus4);
        company1.addBus(bus5);
        company1.addBus(bus6);

        System.out.println(Arrays.toString(company1.getBusPark()));
        System.out.println();
        System.out.println(Arrays.toString(company1.findBusesByPassengerCapacity(20, 45)));
    }


}
