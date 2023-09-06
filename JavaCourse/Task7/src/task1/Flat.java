package task1;

import task1.appliances.Appliances;
import task1.appliances.KitchenAppliances;


public class Flat {
    private static final int MAX_COUNT = 100;
    private int currentCount = 0;
    private Appliances[] flatAppliances = new Appliances[MAX_COUNT];
    private double totalPowerConsumption = 0;
    private Appliances[] flatAppliancesSorted;


    public void addNewAppliancesToFlat(Appliances appliances) {
        flatAppliances[currentCount] = appliances;
        currentCount++;
        System.out.println("Добавлено");
        System.out.println(currentCount);
    }

    public double calculateTotalPowerConsumption(Appliances[] flatAppliances) {
        for (int i = 0; i < currentCount; i++) {
            totalPowerConsumption += flatAppliances[i].getPower();
        }
        return totalPowerConsumption;
    }

    public void sortByPowerAsc(Appliances[] flatAppliances) {
        Appliances temp;
        for (int i = 0; i < currentCount; i++) {
            for (int j = 0; j < currentCount - 1 - i; j++) {
                if (flatAppliances[j].getPower() > flatAppliances[j + 1].getPower()) {
                    temp = flatAppliances[j];
                    flatAppliances[j] = flatAppliances[j + 1];
                    flatAppliances[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < currentCount; i++) {
            System.out.println(flatAppliances[i].getProducer() + " " + flatAppliances[i].getPower());
        }
    }

    public Appliances[] findKitchenAppliancesByPower(double minPower, double maxPower) {
        int foundKitchenAppliancesByPower = 0;
        for (int i = 0; i < currentCount; i++) {
            if (flatAppliances[i] instanceof KitchenAppliances && flatAppliances[i].getPower() >= minPower && flatAppliances[i].getPower() <= maxPower) {
                System.out.println(flatAppliances[i].getProducer() + " " + flatAppliances[i].getPower());
                foundKitchenAppliancesByPower++;
            }
        }
        Appliances[] foundKitchenAppliances = new Appliances[foundKitchenAppliancesByPower];
        int foundKitchenAppliancesCounter = 0;
        for (int i = 0; i < foundKitchenAppliancesByPower; i++) {
            if (flatAppliances[i] instanceof KitchenAppliances && flatAppliances[i].getPower() >= minPower && flatAppliances[i].getPower() <= maxPower) {
                foundKitchenAppliances[foundKitchenAppliancesCounter] = flatAppliances[i];
                foundKitchenAppliancesCounter++;
            }
        }
        return foundKitchenAppliances;
    }

    public Appliances[] getFlatAppliances() {
        return flatAppliances;
    }

    public void setFlatAppliances(Appliances[] flatAppliances) {
        this.flatAppliances = flatAppliances;
    }

    public double getTotalPowerConsumption() {
        return totalPowerConsumption;
    }

    public void setTotalPowerConsumption(double totalPowerConsumption) {
        this.totalPowerConsumption = totalPowerConsumption;
    }

    public Appliances[] getFlatAppliancesSorted() {
        return flatAppliancesSorted;
    }

    public void setFlatAppliancesSorted(Appliances[] flatAppliancesSorted) {
        this.flatAppliancesSorted = flatAppliancesSorted;
    }


}

