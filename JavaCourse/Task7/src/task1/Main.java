package task1;

import task1.appliances.Kettle;
import task1.appliances.VacuumCleaner;


public class Main {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Holt", 2000, 1.8, true);
        kettle.turnOn();
        kettle.showDescription();
        Kettle kettle1 = new Kettle("Redmond", 200, 2, true);
        kettle1.showDescription();
        kettle1.turnOn();
        Flat flat = new Flat();
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Thomas", 10, 23, 2);
        vacuumCleaner.showDescription();
        vacuumCleaner.turnOn();
        flat.addNewAppliancesToFlat(kettle);
        flat.addNewAppliancesToFlat(kettle1);
        flat.addNewAppliancesToFlat(vacuumCleaner);
        System.out.println(flat.calculateTotalPowerConsumption(flat.getFlatAppliances()));
        flat.sortByPowerAsc(flat.getFlatAppliances());
        System.out.println(kettle1);
        System.out.println(vacuumCleaner);
        flat.findKitchenAppliancesByPower(3, 2000);


    }

}
